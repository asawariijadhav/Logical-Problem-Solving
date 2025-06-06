$sourceBase = "D:\Logic-Building\Logic-Building-Assignments"
$targetBase = "D:\Logic-Building\Logical-Problem-Solving\Java_Programming"

if (!(Test-Path -Path $targetBase)) {
    New-Item -ItemType Directory -Path $targetBase
}

$programCounter = 1

for ($i = 1; $i -le 27; $i++) {
    $assignmentFolder = Join-Path $sourceBase "Assignment_$i"

    for ($j = 1; $j -le 5; $j++) {
        $cFile = Join-Path $assignmentFolder "question$j.c"

        if (Test-Path $cFile) {
            $javaFile = "Program$programCounter.java"
            $javaPath = Join-Path $targetBase $javaFile
            $cCode = Get-Content $cFile -Raw

            # Extract first comment line (usually the question)
            $firstLine = ($cCode -split "`n")[0] -replace '//', '//' -replace '^\s*//\s*', '// '

            # Clean C → Java conversion (light version)
            $convertedCode = $cCode `
                -replace '#include\s*<stdio.h>', '' `
                -replace '#define\s+TRUE\s+1', '' `
                -replace '#define\s+FALSE\s+0', '' `
                -replace 'typedef\s+int\s+BOOL;', '' `
                -replace '\bTRUE\b', 'true' `
                -replace '\bFALSE\b', 'false' `
                -replace '\bBOOL\b', 'boolean' `
                -replace 'printf\("([^"]*)\\n",\s*(.*)\);', 'System.out.println(String.format("$1", $2));' `
                -replace 'printf\("([^"]*)\\n"\);', 'System.out.println("$1");' `
                -replace 'printf\("([^"]*)",\s*(.*)\);', 'System.out.print(String.format("$1", $2));' `
                -replace 'printf\("([^"]*)"\);', 'System.out.print("$1");' `
                -replace 'scanf\(".*",\s*&?(\w+)\);', '$1 = scanner.nextInt();' `
                -replace '\bvoid\s+main\s*\(\s*\)', 'public static void main(String[] args)' `
                -replace '\bint\s+main\s*\(\s*\)', 'public static void main(String[] args)' `
                -replace '\bvoid\b', 'public static void' `
                -replace 'return\s+0;', '' `
                -replace 'public static public static', 'public static' `
                -replace 'static\s+(int|boolean)\s', '$1 ' `
                -replace '//.*', ''  # remove all C-style comments

            # Insert instance method fix
            if ($convertedCode -match '\n\s*int\s+\w+\(int') {
                $convertedCode = $convertedCode -replace 'int\s+(\w+)\(int', 'public int $1(int'
                $convertedCode = $convertedCode -replace 'iRet\s*=\s*(\w+)\((.*?)\);', "Program$programCounter obj = new Program$programCounter();`n        iRet = obj.$1($2);"
            }

            # Add Scanner if needed
            $header = ""
            if ($convertedCode -match 'scanner.nextInt') {
                $header = "import java.util.*;\n\npublic class Program$programCounter {\n    public static Scanner scanner = new Scanner(System.in);"
            } else {
                $header = "public class Program$programCounter {"
            }

            # Final assembly
            $finalCode = "$firstLine`n\n$header`n$convertedCode`n}"

            Set-Content -Path $javaPath -Value $finalCode
            Write-Host "✅ Cleaned: Program$programCounter.java"
            $programCounter++
        } else {
            Write-Host "⚠️  Skipped: Assignment_$i/question$j.c not found"
        }
    }
}

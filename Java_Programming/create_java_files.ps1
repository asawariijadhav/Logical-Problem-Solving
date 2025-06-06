for ($i = 1; $i -le 150; $i++) {
    $fileName = "Program$i.java"
    @"
public class Program$i {
    public static void main(String[] args) {
        System.out.println("Program $i");
    }
}
"@ | Set-Content -Encoding ASCII $fileName
}

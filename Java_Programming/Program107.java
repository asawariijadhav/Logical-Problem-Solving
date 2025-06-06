/*
\nimport java.util.*;\n\npublic class Program107 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2. Accept character and check whether it is capital or not (A-Z)
Input : F
Output : true

Input: d
Output :false

*/






boolean ChkCapital(char ch)
{
  char ch = '\0';

  if (ch >= 'A' && ch <= 'Z')
    return true;
  else
    return false;
}

public static void main(String[] args)
{
  char cValue = '\0';
  boolean bRet = false;

  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  bRet = ChkCapital(cValue);

  if (bRet == true)
    System.out.println("It is Capital Character");
  else
    System.out.println("It is not a Capital Character");

  
}

}

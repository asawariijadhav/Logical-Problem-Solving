/*
\nimport java.util.*;\n\npublic class Program108 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3. Accept character and check whether it is digit or not (0-9)

Input: 7
Output : true

Input: d
Output :false

*/






boolean ChkDigit(char ch)
{
  char ch = '\0';

  if (ch >= '0' && ch <= '9')
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

  bRet = ChkDigit(cValue);

  if (bRet == true)
    System.out.println("It is Digit");
  else
    System.out.println("It is not a Digit");

  
}

}

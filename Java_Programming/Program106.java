/*
\nimport java.util.*;\n\npublic class Program106 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1.Accept character and check whether it is alphabet or not (A-Z / a-z).

Input: F
Output : true

Input: &
Output :false

*/






boolean ChkAlpha(char ch)
{
  char ch = '\0';

  if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
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

  bRet = ChkAlpha(cValue);

  if (bRet == true)
    System.out.println("It is Character");
  else
    System.out.println("It is not a Character");

  
}

}

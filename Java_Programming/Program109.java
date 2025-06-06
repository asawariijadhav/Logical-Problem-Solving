/*
\nimport java.util.*;\n\npublic class Program109 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4. Accept character and check whether it is small case or not (a-z)

Input: g
Output : true

Input: D
Output :false

*/






boolean ChkSmall(char ch)
{
  char ch = '\0';

  if (ch >= 'a' && ch <= 'z')
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

  bRet = ChkSmall(cValue);

  if (bRet == true)
    System.out.println("It is Small case Character");
  else
    System.out.println("It is not a Small case Character");

  
}

}

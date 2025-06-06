/*
\nimport java.util.*;\n\npublic class Program114 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4. Check if character is special symbol (!, @, #, $, %, ^, &, *)
*/







boolean ChkSpecial(char ch)
{
  if (ch == '!' || ch == '@' || ch == '#' || ch == '$' ||
      ch == '%' || ch == '^' || ch == '&' || ch == '*')
  {
    return true;
  }
  else
  {
    return false;
  }
}

public static void main(String[] args)
{
  char cValue = '\0';
  boolean bRet = false;

  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  bRet = ChkSpecial(cValue);
  if (bRet == true)
  {
    System.out.println("It is a special Character");
  }
  else
  {
    System.out.println("It is not a special Character");
  }

  
}

}

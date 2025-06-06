// Accept on character from user and check whether that character is vowel(a,e,i,o,u) or not.
\nimport java.util.*;\n\npublic class Program15 {\n    public static Scanner scanner = new Scanner(System.in);








boolean ChkVowel(char ch)
{
  if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
      ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
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

  System.out.print("Enter a character: ");
  cValue = scanner.nextInt();

  bRet = ChkVowel(cValue);

  if (bRet == true)
  {
    System.out.println("It is vowel");
  }
  else
  {
    System.out.println("It is not vowel");
  }

  
}

}

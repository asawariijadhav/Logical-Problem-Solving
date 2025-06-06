/*
\nimport java.util.*;\n\npublic class Program113 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3. Print A-Z from input (if capital) or reverse a-z to input (if small)

*/



public static void Display(char ch)
{
  if (ch >= 'A' && ch <= 'Z')
  {
    for (char i = ch; i <= 'Z'; i++)
    {
      System.out.print(String.format("%c ", i));
    }
    System.out.println("");
  }
  else if (ch >= 'a' && ch <= 'z')
  {
    for (char i = ch; i >= 'a'; i--)
    {
      System.out.print(String.format("%c ", i));
    }
    System.out.println("");
  }
  else
  {
    System.out.println(String.format("%c", ch));
  }
}

public static void main(String[] args)
{
  char cValue = '\0';
  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  Display(cValue);
  
}

}

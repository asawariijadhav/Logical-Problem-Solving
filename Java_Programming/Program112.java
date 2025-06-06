/*
\nimport java.util.*;\n\npublic class Program112 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2. Toggle case: if small → capital, if capital → small, else as is
*/



public static void Display(char ch)
{
  if ((ch >= 'a') && (ch <= 'z'))

    System.out.println(String.format("%c", ch - ('a' - 'A')));

  else if ((ch >= 'A') && (ch <= 'Z'))

    System.out.println(String.format("%c", ch + ('a' - 'A')));

  else
    System.out.println(String.format("%c", ch));
}

public static void main(String[] args)
{
  char cValue = '\0';
  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  Display(cValue);
  
}

}

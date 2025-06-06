/*
\nimport java.util.*;\n\npublic class Program115 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5. Display ASCII value in Decimal, Octal, and Hex format

*/


public static void Display(char ch)
{
  System.out.println(String.format("Decimal\t\t: %d", ch));
  System.out.println(String.format("Octal\t\t: %o", ch));
  System.out.println(String.format("Hexadecimal\t: 0X%X", ch));
}

public static void main(String[] args)
{
  char cValue = '\0';
  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  Display(cValue);
  
}

}

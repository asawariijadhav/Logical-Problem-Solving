// Accept one character from user and convert case of that character.
\nimport java.util.*;\n\npublic class Program14 {\n    public static Scanner scanner = new Scanner(System.in);




public static void DisplayConvert(char CValue)
{
  if (CValue >= 'a' && CValue <= 'z')
  {
    System.out.println(String.format("Converted character: %c", CValue - 32)); 
  }
  else if (CValue >= 'A' && CValue <= 'Z')
  {
    System.out.println(String.format("Converted character: %c", CValue + 32)); 
  }
  else
  {
    System.out.println("Invalid character.");
  }
}

public static void main(String[] args)
{
  char cValue = '\0';

  System.out.print("Enter a character: ");
  cValue = scanner.nextInt(); 

  DisplayConvert(cValue);

  
}

}

/*
\nimport java.util.*;\n\npublic class Program126 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1. Write a program which accepts string from user and a character. Check whether that character is present in string or not.
Input:
"Marvellous Multi OS"
e

Output:
true

Input:
"Marvellous Multi OS"
W

Output:
false
*/







boolean ChkChar(char *str, char ch)
{
  while (*str != '\0')
  {
    if (*str == ch)
    {
      return true;
    }
    str++;
  }
  return false;
}

public static void main(String[] args)
{
  char arr[50];
  char cValue;
  boolean bRet = false;

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  getchar();

  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  bRet = ChkChar(arr, cValue);

  if (bRet == true)
  {
    System.out.println("Character found");
  }
  else
  {
    System.out.println("Character not found");
  }

  
}

}

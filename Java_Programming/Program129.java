/*
\nimport java.util.*;\n\npublic class Program129 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4. Write a program to return index of last occurrence of a character

Input :"Marvellous Multi OS", 'M'


Output :11
*/



int LastChar(char *str, char ch)
{
  int i = 0;
  int pos = -1;

  while (str[i] != '\0')
  {
    if (str[i] == ch)
    {
      pos = i;
    }
    i++;
  }

  return pos;
}

public static void main(String[] args)
{
  char arr[50];
  char cValue;
  int iRet = 0;

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  iRet = LastChar(arr, cValue);

  if (iRet != -1)
    System.out.println(String.format("Character location is %d", iRet));
  else
    System.out.println("Character not found");

  
}

}

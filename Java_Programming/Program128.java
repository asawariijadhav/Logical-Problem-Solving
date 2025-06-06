/*
\nimport java.util.*;\n\npublic class Program128 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3. Write a program to return index of first occurrence of a character
Input : "Marvellous Multi OS", 'M'


Output: 0
*/



int FirstChar(char *str, char ch)
{
  int i = 0;
  while (str[i] != '\0')
  {
    if (str[i] == ch)
    {
      return i;
    }
    i++;
  }
  return -1; 
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

  iRet = FirstChar(arr, cValue);

  if (iRet != -1)
    System.out.println(String.format("Character location is %d", iRet));
  else
    System.out.println("Character not found");

  
}

}

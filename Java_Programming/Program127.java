/*
\nimport java.util.*;\n\npublic class Program127 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2. Write a program which accepts string from user and a character. Return frequency of that character.
Input:
"Marvellous Multi OS"
M

Output:
2

Input:
"Marvellous Multi OS"
W

Output:
0


*/



int CountChar(char *str, char ch)
{
  int iCnt = 0;

  while (*str != '\0')
  {
    if (*str == ch)
    {
      iCnt++;
    }
    str++;
  }

  return iCnt;
}

public static void main(String[] args)
{
  char arr[50];
  char cValue;
  int iRet = 0;

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  getchar(); 

  System.out.print("Enter the character: ");
  cValue = scanner.nextInt();

  iRet = CountChar(arr, cValue);

  System.out.println(String.format("Character frequency is %d", iRet));

  
}

}

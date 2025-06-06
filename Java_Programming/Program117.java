/*
\nimport java.util.*;\n\npublic class Program117 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2. Write a program which accepts string from user and count number of small characters.

Input:
"Marvellous"

Output:
9

*/



int CountSmall(char *str)
{
  int iCnt = 0;

  while (*str != '\0')
  {
    if ((*str >= 'a') && (*str <= 'z'))
    {
      iCnt++;
    }
    str++;
  }

  return iCnt;
}

public static void main(String[] args)
{
  char arr[20];
  int iRet = 0;

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  iRet = CountSmall(arr);

  System.out.println(String.format("%d", iRet));

  
}

}

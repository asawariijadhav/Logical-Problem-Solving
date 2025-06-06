/*
\nimport java.util.*;\n\npublic class Program125 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5: Count Number of White Spaces
Input 1: "MarvellouS" → Output: 0
Input 2: "Marvellous Infosystems" → Output: 1
Input 3: "Marvellous Infosystems by Piyush Manohar Khairnnar" → Output: 5

*/



int CountWhite(char *str)
{
  int iCnt = 0;

  while (*str != '\0')
  {
    if (*str == ' ')
    {
      iCnt++;
    }
    str++;
  }

  return iCnt;
}

public static void main(String[] args)
{
  char arr[100];
  int iRet = 0;

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  iRet = CountWhite(arr);

  System.out.println(String.format("%d", iRet));

  
}

}

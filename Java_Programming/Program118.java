/*
\nimport java.util.*;\n\npublic class Program118 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3. Write a program which accepts string from user and return difference between frequency of small characters and capital characters.

Input:
"Marvellous"

Output:
6 (8 - 2)
*/



int Difference(char *str)
{
  int iSmall = 0;
  int iCapital = 0;

  while (*str != '\0')
  {
    if ((*str >= 'A') && (*str <= 'Z'))
    {
      iCapital++;
    }
    else if ((*str >= 'a') && (*str <= 'z'))
    {
      iSmall++;
    }
    str++;
  }

  return iSmall - iCapital;
}

public static void main(String[] args)
{
  char arr[20];
  int iRet = 0;

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  iRet = Difference(arr);

  System.out.println(String.format("%d", iRet));

  
}

}

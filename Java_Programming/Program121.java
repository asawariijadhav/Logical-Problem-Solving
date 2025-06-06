/*
\nimport java.util.*;\n\npublic class Program121 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1. Write a program which accepts string from user and converts it into lowercase.
Input:
"Marvellous Multi OS"
Output:
"marvellous multi os"

*/



public static void strlwrx(char *str)
{
  while (*str != '\0')
  {
    if ((*str >= 'A') && (*str <= 'Z'))
    {
      *str = *str + ('a' - 'A');
    }
    str++;
  }
}

public static void main(String[] args)
{
  char arr[20];

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  strlwrx(arr);

  System.out.println(String.format("Modified string is %s", arr));

  
}

}

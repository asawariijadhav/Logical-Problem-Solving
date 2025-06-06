/*
\nimport java.util.*;\n\npublic class Program122 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2. Write a program which accepts string from user and converts it into uppercase.
Input:
"Marvellous Multi OS"
Output:
"MARVELLOUS MULTI OS"

*/



public static void struprx(char *str)
{
  while (*str != '\0')
  {
    if ((*str >= 'a') && (*str <= 'z'))
    {
      *str = *str - ('a' - 'A');
    }
    str++;
  }
}

public static void main(String[] args)
{
  char arr[20];

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  struprx(arr);

  System.out.println(String.format("Modified string is %s", arr));

  
}

}

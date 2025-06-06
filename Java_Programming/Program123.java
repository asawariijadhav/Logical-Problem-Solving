/*
\nimport java.util.*;\n\npublic class Program123 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3. Write a program which accepts string from user and toggles the case.
Input:
"Marvellous Multi OS"
Output:
"mARVELLOUS mULTI os"

*/



public static void strtogglex(char *str)
{
  while (*str != '\0')
  {
    if ((*str >= 'A') && (*str <= 'Z'))
    {
      *str = *str + ('a' - 'A'); 
    }
    else if ((*str >= 'a') && (*str <= 'z'))
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

  strtogglex(arr);

  System.out.println(String.format("Modified string is %s", arr));

  
}

}

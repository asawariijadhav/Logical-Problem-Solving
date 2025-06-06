/*
\nimport java.util.*;\n\npublic class Program120 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5. Write a program which accepts string from user and display it in reverse order.

Input:
"MarvellousS"
Output:
"SuollevraM"

*/


#include <string.h>

public static void Reverse(char *str)
{
  int i = 0, j = strlen(str) - 1;
  char temp;

  while (i < j)
  {
    temp = str[i];
    str[i] = str[j];
    str[j] = temp;

    i++;
    j--;
  }
}

public static void main(String[] args)
{
  char arr[20];

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  Reverse(arr);

  System.out.println(String.format("Reversed string: %s", arr));

  
}

}

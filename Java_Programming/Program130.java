/*
\nimport java.util.*;\n\npublic class Program130 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5. Write a program to reverse string in-place

Input : "abcd"


Output : "dcba"

*/



public static void StrRevX(char *str)
{
  char temp;
  int i = 0, j = 0;

  while (str[j] != '\0')
  {
    j++;
  }
  j = j - 1;

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
  char arr[50];

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  StrRevX(arr);

  System.out.println(String.format("Modified string is %s", arr));

  
}

}

/*
\nimport java.util.*;\n\npublic class Program124 {\n    public static Scanner scanner = new Scanner(System.in);
/*
 4: Display Only Digits from String
Input:
"marve89llous121"
Output:
89121

*/



public static void DisplayDigit(char *str)
{
  while (*str != '\0')
  {
    if ((*str >= '0') && (*str <= '9'))
    {
      System.out.print(String.format("%c", *str));
    }
    str++;
  }
  System.out.println("");
}

public static void main(String[] args)
{
  char arr[50];

  System.out.print("Enter string: ");
  arr = scanner.nextInt();

  DisplayDigit(arr);

  
}

}

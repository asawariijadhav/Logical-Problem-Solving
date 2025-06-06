/*
\nimport java.util.*;\n\npublic class Program76 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 4
Output:
*
* *
* * *
* * * *
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0, j = 0;
  for (i = 1; i <= iRow; i++)
  {
    for (j = 1; j <= i; j++)
    {
      System.out.print("*\t");
    }
    System.out.println("");
  }
}

public static void main(String[] args)
{
  int iValue1 = 0;

  System.out.println("Enter number of rows:");
  iValue1 = scanner.nextInt();

  Pattern(iValue1, 0);

  
}

}

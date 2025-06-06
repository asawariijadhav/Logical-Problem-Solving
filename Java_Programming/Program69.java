/*
\npublic class Program69 {
/*
4. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 5, iCol = 5
Output:
 1  2  3  4  5
-1 -2 -3 -4 -5
 1  2  3  4  5
-1 -2 -3 -4 -5
 1  2  3  4  5
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0, j = 0;
  int num = 0;

  for (i = 1; i <= iRow; i++)
  {
    for (j = 1; j <= iCol; j++)
    {
      num = j;
      if (i % 2 != 0)
        System.out.print(String.format("%d\t", num));
      else
        System.out.print(String.format("-%d\t", num));
    }
    System.out.println("");
  }
}

public static void main(String[] args)
{
  int iValue1 = 0, iValue2 = 0;

  System.out.print("Enter number of rows and columns: ");
  scanf("%d %d", &iValue1, &iValue2);

  Pattern(iValue1, iValue2);
  
}

}

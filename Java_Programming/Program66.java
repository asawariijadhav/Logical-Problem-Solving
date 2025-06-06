/*
\npublic class Program66 {
/*
1. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 4
Output:
1  2  3  4
5  6  7  8
9  1  2  3
4  5  6  7
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0, j = 0, num = 1;

  for (i = 1; i <= iRow; i++)
  {
    for (j = 1; j <= iCol; j++)
    {
      System.out.print(String.format("%d\t", num));
      num++;

      if (num == 10)
        num = 1;
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

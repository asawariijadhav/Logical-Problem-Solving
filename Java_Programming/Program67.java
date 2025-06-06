/*
\npublic class Program67 {
/*
2. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 5
Output:
2  4  6  8 10
1  3  5  7  9
2  4  6  8 10
1  3  5  7  9
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0, j = 0, iStart = 0;

  for (i = 1; i <= iRow; i++)
  {

    if (i % 2 != 0)
      iStart = 2;
    else
      iStart = 1;

    for (j = 1; j <= iCol; j++)
    {
      System.out.print(String.format("%d\t", iStart));
      iStart = iStart + 2;
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

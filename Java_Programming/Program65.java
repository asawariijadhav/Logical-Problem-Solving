/*
\npublic class Program65 {
/*
5. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 3, iCol = 4
Output:
1   2   3   4
5   6   7   8
9  10  11  12
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0;
  int j = 0;
  int num = 1;
  for (i = 0; i < iRow; i++)
  {
    for (j = 0; j < iCol; j++)
    {
      System.out.print(String.format("%d\t", num++));
    }
    System.out.println("");
  }
}

public static void main(String[] args)
{
  int iValue1 = 0, iValue2 = 0;

  System.out.println("Enter number of rows and columns");
  scanf("%d %d", &iValue1, &iValue2);

  Pattern(iValue1, iValue2);

  
}

}

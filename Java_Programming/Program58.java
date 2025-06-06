/*
\npublic class Program58 {
/*
3. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 3  iCol = 5
Output:
5  4  3  2  1
5  4  3  2  1
5  4  3  2  1
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0;
  int j = 0;
  for (i = 1; i <= iRow; i++)
  {
    for (j = iCol; j >= 1; j--)
    {
      System.out.print(String.format("%d\t", j));
    }
    System.out.println("");
  }
}

public static void main(String[] args)
{
  int iValue1 = 0, iValue2 = 0;

  System.out.print("Enter number of rows and columns:");
  scanf("%d %d", &iValue1, &iValue2);

  Pattern(iValue1, iValue2);

  
}

}

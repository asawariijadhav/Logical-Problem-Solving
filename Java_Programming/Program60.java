/*
\npublic class Program60 {
/*
5. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 3  iCol = 4
Output:
1  1  1  1
2  2  2  2
3  3  3  3
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0;
  int j = 0;

  for (i = 1; i <= iRow; i++)
  {
    for (j = 1; j <= iCol; j++)
    {
      System.out.print(String.format("%d\t", i));
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

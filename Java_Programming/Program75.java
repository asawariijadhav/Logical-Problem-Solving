/*
\npublic class Program75 {
/*
5. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 4
Output:
1	2	3	4
1	*	*	4
1	*	*	4
1	2	3	4
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0, j = 0;

  for (i = 1; i <= iRow; i++)
  {
    for (j = 1; j <= iCol; j++)
    {
      if (i == 1 || i == iRow)

        System.out.print(String.format("%d\t", j));

      else if (j == 1 || j == iCol)

        System.out.print(String.format("%d\t", j));

      else

        System.out.print("*\t");
    }
    System.out.println("");
  }
}

public static void main(String[] args)
{
  int iValue1 = 0, iValue2 = 0;

  System.out.println("Enter number of rows and columns:");
  scanf("%d %d", &iValue1, &iValue2);

  Pattern(iValue1, iValue2);

  
}

}

/*
\npublic class Program83 {
/*
3. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 4
Output:
* * * * * *
*       * *
*     *   *
*   *     *
* *       *
* * * * * *

*/

public static void Pattern(int iRow, int iCol)
{
  int i = 0, j = 0;

  for (int i = 1; i <= iRow; i++)
  {
    for (int j = 1; j <= iCol; j++)
    {
      if (i == 1 || i == iRow || j == 1 || j == iCol || i == j || j == (iCol - i + 1))

        System.out.print("* ");

      else

        System.out.print("  ");
    }
    System.out.println("");
  }
}
public static void main(String[] args)

{

  int iValue1 = 0, iValue2 = 0;

  System.out.print("Enter number of rows and columns");

  scanf("%d %d", &iValue1, &iValue2);

  Pattern(iValue1, iValue2);

  
}

}

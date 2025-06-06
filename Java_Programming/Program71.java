/*
\npublic class Program71 {
/*
1. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 4
Output:
*	#	#	#
*	*	#	#
*	*	*	#
*	*	*	*
*/



public static void Pattern(int iRow, int iCol)
{

  int i = 0, j = 0;

  for (i = 1; i <= iRow; i++)
  {
    for (j = 1; j <= iCol; j++)
    {
      if (j <= i)

        System.out.print("*\t");

      else

        System.out.print("#\t");
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

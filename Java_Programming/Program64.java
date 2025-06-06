/*
\npublic class Program64 {
/*
4. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 5
Output:
4	4	4	4	4
3	3	3	3	3
2	2	2	2	2
1	1	1	1	1
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0;
  int j = 0;
  char ch = '\0';

  for (i = iRow; i >= 1; i--)
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

  System.out.println("Enter number of rows and columns");
  scanf("%d %d", &iValue1, &iValue2);

  Pattern(iValue1, iValue2);

  
}

}

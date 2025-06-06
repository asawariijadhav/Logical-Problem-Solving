/*
\npublic class Program63 {
/*
3. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 3, iCol = 5
Output:
A  A  A  A  A
B  B  B  B  B
C  C  C  C  C
*/



public static void Pattern(int iRow, int iCol)
{

  int i = 0;
  int j = 0;
  char ch = '\0';

  for (i = 0; i < iRow; i++)
  {
    ch = 'A' + i;

    for (j = 0; j < iCol; j++)
    {
      System.out.print(String.format("%c\t", ch));
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

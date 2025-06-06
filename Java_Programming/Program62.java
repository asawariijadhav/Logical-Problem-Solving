/*
\npublic class Program62 {
/*
2. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 4
Output:
A  B  C  D
a  b  c  d
A  B  C  D
a  b  c  d
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0;
  int j = 0;
  char ch = '\0';

  for (i = 0; i < iRow; i++)
  {
    if (i % 2 == 0)
    {
      ch = 'A';
    }
    else
    {
      ch = 'a';
    }

    for (j = 0; j < iCol; j++)
    {
      System.out.print(String.format("%c\t", ch));
      ch++;
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

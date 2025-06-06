/*
\npublic class Program61 {
/*
1. Accept number of rows and number of columns from user and display below pattern.
Input: iRow = 4, iCol = 4
Output:
A  B  C  D
A  B  C  D
A  B  C  D
A  B  C  D
*/



public static void Pattern(int iRow, int iCol)
{
  int i = 0;
  int j = 0;
  char ch = '\0';

  for (i = 0; i < iRow; i++)
  {
    ch = 'A';

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
  int iValue1 = 0; 
  int iValue2 = 0; 

  System.out.println("Enter number of rows and columns");
  scanf("%d %d", &iValue1, &iValue2);

  Pattern(iValue1, iValue2); 

  
}

}

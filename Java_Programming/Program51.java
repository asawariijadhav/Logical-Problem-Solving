/*
\nimport java.util.*;\n\npublic class Program51 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Accept number from user and display below pattern.

Input: 5
Output:A    B    C    D    E

*/



public static void Pattern(int iNo)
{
  int iCnt = 0;
  char ch = 'A';

  for (iCnt = 0; iCnt < iNo; iCnt++)
  {
    System.out.print(String.format("%c\t", ch));
    ch++; 
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.println("Enter number of elements");
  iValue = scanner.nextInt();

  Pattern(iValue);

  
}

}

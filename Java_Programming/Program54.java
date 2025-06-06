/*
\nimport java.util.*;\n\npublic class Program54 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4. Accept number from user and display below pattern.
Input: 4
Output:#    1    *    #    2    *    #    3    *    #    4    *

*/



public static void Pattern(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    System.out.print(String.format("#\t%d\t*\t", iCnt));
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

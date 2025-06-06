/*
\nimport java.util.*;\n\npublic class Program52 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2. Accept number from user and display below pattern.
Input: 5
Output:5    #    4    #    3    #    2    #    1    #

*/



public static void Pattern(int iNo)
{
  int iCnt = 0;
  for (iCnt = iNo; iCnt >= 1; iCnt--)
  {
    System.out.print(String.format("%d\t#\t", iCnt));
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

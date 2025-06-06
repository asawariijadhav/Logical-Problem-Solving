/*
\nimport java.util.*;\n\npublic class Program53 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3. Accept number from user and display below pattern.
Input: 5
Output:1    *    2    *    3    *    4    *    5    *

*/



public static void Pattern(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    System.out.print(String.format("%d\t*\t", iCnt));
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

/*
\nimport java.util.*;\n\npublic class Program17 {\n    public static Scanner scanner = new Scanner(System.in);
/*

2. Write a program which accept number from user and display its factors in decreasing order.

Input:  12
Output: 6   4   3   2   1

Input:  10
Output: 5   2   1

Input:   8
Output: 4   2   1

Time Complexity:
O(n) where n = iNo/2

*/



public static void FactRev(int iNo)
{
  int iCnt = 0;

  for (iCnt = iNo / 2; iCnt >= 1; iCnt--)
  {
    if (iNo % iCnt == 0)
    {
      System.out.print(String.format("%d  ", iCnt));
    }
  }
  System.out.println("");
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  FactRev(iValue);

  
}

}

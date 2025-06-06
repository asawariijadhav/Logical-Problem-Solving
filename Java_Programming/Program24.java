/*
\nimport java.util.*;\n\npublic class Program24 {\n    public static Scanner scanner = new Scanner(System.in);
/*

4. Write a program which accept number from user and print odd numbers up to that number.

Input: 13
Output: 1 3 5 7 9 11 13

Time Complexity: O(n)

*/



public static void OddDisplay(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    if (iCnt % 2 != 0)
    {
      System.out.print(String.format("%d ", iCnt));
    }
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  OddDisplay(iValue);

  
}

}

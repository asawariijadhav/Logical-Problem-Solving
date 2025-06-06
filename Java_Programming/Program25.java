/*
\nimport java.util.*;\n\npublic class Program25 {\n    public static Scanner scanner = new Scanner(System.in);
/*

Write a program which accept number and print its multiples of 5 up to that number.

Input: 25
Output: 5 10 15 20 25

Time Complexity: O(n)

*/



public static void MultDisplay(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    if (iCnt % 5 == 0)
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

  MultDisplay(iValue);

  
}

}

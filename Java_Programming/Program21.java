/*
\nimport java.util.*;\n\npublic class Program21 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Write a program which accept number from user and print that number of * on screen.

Input: 5
Output: * * * * *

Input: 3
Output: * * *

Input: -3
Output: * * *

Time Complexity: O(n)

*/



public static void Pattern(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    System.out.print("* ");
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Pattern(iValue);

  
}

}

/*
\nimport java.util.*;\n\npublic class Program31 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Write a program which accepts number from user and displays below pattern.

Input: 5
Output: * * * * *

Time Complexity: O(n)

*/



public static void Display(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    System.out.print("*\t");
  }
}

public static void main(String[] args)
{
  int iValue = 0;
  System.out.println("Enter number:");
  iValue = scanner.nextInt();

  Display(iValue);

  
}

}

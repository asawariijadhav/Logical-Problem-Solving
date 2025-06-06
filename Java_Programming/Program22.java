/*
\nimport java.util.*;\n\npublic class Program22 {\n    public static Scanner scanner = new Scanner(System.in);
/*

2. Write a program which accept number from user and print numbers till that number.

Input: 8
Output: 1 2 3 4 5 6 7 8

Time Complexity: O(n)

*/



public static void Display(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    System.out.print(String.format("%d ", iCnt));
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Display(iValue);

  
}

}

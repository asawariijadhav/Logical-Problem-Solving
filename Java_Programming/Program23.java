/*
\nimport java.util.*;\n\npublic class Program23 {\n    public static Scanner scanner = new Scanner(System.in);
/*

3. Write a program which accept number from user and print even numbers till that number.

Input: 8
Output: 2 4 6 8

Time Complexity: O(n)

*/



public static void DisplayEven(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    if (iCnt % 2 == 0)
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

  DisplayEven(iValue);

  
}

}

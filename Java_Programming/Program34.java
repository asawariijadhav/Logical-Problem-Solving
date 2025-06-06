/*
\nimport java.util.*;\n\npublic class Program34 {\n    public static Scanner scanner = new Scanner(System.in);
/*

4. Write a program to find odd factorial of given number.

Input: 5
Output: 15  (5 * 3 * 1)

Time Complexity: O(n)

*/



public int OddFactorial(int iNo)
{
  int iCnt = 0;
  int iFact = 1;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    if (iCnt % 2 != 0)
    {
      iFact *= iCnt;
    }
  }
  return iFact;
}

public static void main(String[] args)
{
  int iValue = 0;
  int iRet = 0;

  System.out.println("Enter number:");
  iValue = scanner.nextInt();

  Program34 obj = new Program34();
        iRet = obj.();
  System.out.println(String.format("Odd factorial of number is: %d", iRet));

  
}

}

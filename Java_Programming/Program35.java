/*
\nimport java.util.*;\n\npublic class Program35 {\n    public static Scanner scanner = new Scanner(System.in);
/*

5. Write a program which returns the difference between even factorial and odd factorial of given number.

Input: 5
Output: -7  (8 - 15)

Time Complexity: O(n)

*/



public int EvenFactorial(int iNo)
{
  int iCnt = 0;
  int iFact = 1;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    if (iCnt % 2 == 0)
    {
      iFact *= iCnt;
    }
  }
  return iFact;
}

public int OddFactorial(int iNo)
{
  int iFact = 1;
  for (int i = 1; i <= iNo; i++)
  {
    if (i % 2 != 0)
    {
      iFact *= i;
    }
  }
  return iFact;
}

public int FactorialDiff(int iNo)
{
  return EvenFactorial(iNo) - OddFactorial(iNo);
}

public static void main(String[] args)
{
  int iValue = 0;
  int iRet = 0;

  System.out.println("Enter number:");
  iValue = scanner.nextInt();

  Program35 obj = new Program35();
        iRet = obj.();
  System.out.println(String.format("Difference is: %d", iRet));

  
}

}

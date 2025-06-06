/*
\nimport java.util.*;\n\npublic class Program33 {\n    public static Scanner scanner = new Scanner(System.in);
/*

3. Write a program to find even factorial of given number.

Input: 5
Output:8  (4 * 2)


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

public static void main(String[] args)
{
  int iValue = 0;
  int iRet = 0;

  System.out.println("Enter number:");
  iValue = scanner.nextInt();

  Program33 obj = new Program33();
        iRet = obj.();
  System.out.println(String.format("Even factorial of number is: %d", iRet));

  
}

}

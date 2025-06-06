/*
\nimport java.util.*;\n\npublic class Program19 {\n    public static Scanner scanner = new Scanner(System.in);
/*

4. Write a program which accept number from user and return summation of all its non factors.

Input:  12
Output: 50

Input:  10
Output: 38

Input:   8
Output: 21

Time Complexity:
O(n) where n = iNo

*/



public int SumNonFact(int iNo)
{
  int iCnt = 0, iSum = 0;

  for (iCnt = 1; iCnt < iNo; iCnt++)
  {
    if (iNo % iCnt != 0)
    {
      iSum += iCnt;
    }
  }

  return iSum;
}

public static void main(String[] args)
{
  int iValue = 0, iRet = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Program19 obj = new Program19();
        iRet = obj.();

  System.out.println(String.format("Summation of non-factors: %d", iRet));

  
}

}

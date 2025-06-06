/*
\nimport java.util.*;\n\npublic class Program47 {\n    public static Scanner scanner = new Scanner(System.in);
/*

2. Write a program which accepts a number from the user and returns the count of odd digits.

Input: 2395   → Output: 3
Input: 1018   → Output: 2
Input: -1018  → Output: 2
Input: 8462   → Output: 0

Time Complexity: O(n)

*/



public int CountOdd(int iNo)
{
  int iDigit = 0, iCnt = 0;

  if (iNo < 0)
    iNo = -iNo;

  while (iNo != 0)
  {
    iDigit = iNo % 10;
    if (iDigit % 2 != 0)
    {
      iCnt++;
    }
    iNo = iNo / 10;
  }
  return iCnt;
}

public static void main(String[] args)
{
  int iValue = 0, iRet = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Program47 obj = new Program47();
        iRet = obj.();

  System.out.println(String.format("%d", iRet));
  
}

}

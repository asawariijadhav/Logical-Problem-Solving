/*
\nimport java.util.*;\n\npublic class Program46 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Write a program which accepts a number from the user and returns the count of even digits.

Input: 2395   → Output: 1  
Input: 1018   → Output: 2  
Input: -1018  → Output: 2  
Input: 8462   → Output: 4


Time Complexity: O(n)

*/



public int CountEven(int iNo)
{
  int iDigit = 0, iCnt = 0;

  if (iNo < 0)
    iNo = -iNo;

  while (iNo != 0)
  {
    iDigit = iNo % 10;
    if (iDigit % 2 == 0)
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

  Program46 obj = new Program46();
        iRet = obj.();

  System.out.println(String.format("%d", iRet));
  
}

}

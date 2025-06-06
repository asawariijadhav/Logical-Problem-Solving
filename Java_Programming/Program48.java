/*
\nimport java.util.*;\n\npublic class Program48 {\n    public static Scanner scanner = new Scanner(System.in);
/*

3. Write a program which accepts a number and returns the count of digits in range 3 to 7.

Input: 2395   → Output: 1
Input: 1018   → Output: 0
Input: 4521   → Output: 1
Input: 9922   → Output: 0


Time Complexity: O(n)

*/



public int CountRange(int iNo)
{
  int iDigit = 0, iCnt = 0;

  if (iNo < 0)
    iNo = -iNo;

  while (iNo != 0)
  {
    iDigit = iNo % 10;
    if (iDigit >= 3 && iDigit <= 7)
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

  Program48 obj = new Program48();
        iRet = obj.();

  System.out.println(String.format("%d", iRet));
  
}

}

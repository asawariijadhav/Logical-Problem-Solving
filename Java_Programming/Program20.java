/*
\nimport java.util.*;\n\npublic class Program20 {\n    public static Scanner scanner = new Scanner(System.in);
/*

5. Write a program which accept number from user and return difference between summation of all its factors and non factors.

Input:  12
Output: -34   (16 - 50)

Input:  10
Output: -18   (12 - 30)

Input:   8
Output: -6    (15 - 21)

Time Complexity:
O(n) where n = iNo

*/



public int FactDiff(int iNo)
{
  int iCnt = 0, iFactSum = 0, iNonFactSum = 0;

  for (iCnt = 1; iCnt < iNo; iCnt++)
  {
    if (iNo % iCnt == 0)
    {
      iFactSum += iCnt;
    }
    else
    {
      iNonFactSum += iCnt;
    }
  }

  return iFactSum - iNonFactSum;
}

public static void main(String[] args)
{
  int iValue = 0, iRet = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Program20 obj = new Program20();
        iRet = obj.();

  System.out.println(String.format("Difference between sum of factors and non-factors: %d", iRet));

  
}

}

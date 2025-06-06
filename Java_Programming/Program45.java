/*
\nimport java.util.*;\n\npublic class Program45 {\n    public static Scanner scanner = new Scanner(System.in);
/*

5. Write a program which accepts number from user and count frequency of such a digits which are less than 6.

Time Complexity:

*/



public int Count(int iNo)
{
  int iCnt = 0, iDigit = 0;

  if (iNo < 0)
  {
    iNo = -iNo;
  }

  while (iNo != 0)
  {
    iDigit = iNo % 10;
    if (iDigit < 6)
    {
      iCnt++;
    }
    iNo = iNo / 10;
  }
  return iCnt;
}

public static void main(String[] args)
{
  int iValue = 0;
  int iRet = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Program45 obj = new Program45();
        iRet = obj.();
  System.out.println(String.format("%d", iRet));

  
}

}

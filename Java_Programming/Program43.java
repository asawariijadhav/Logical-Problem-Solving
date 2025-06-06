/*
\nimport java.util.*;\n\npublic class Program43 {\n    public static Scanner scanner = new Scanner(System.in);
/*

 Q3. Write a program which accept number from user and count frequency of 2 in it.

Time Complexity:

*/



public int CountTwo(int iNo)
{
  int iCnt = 0, iDigit = 0;

  if (iNo < 0)
  {
    iNo = -iNo;
  }

  while (iNo != 0)
  {
    iDigit = iNo % 10;
    if (iDigit == 2)
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

  Program43 obj = new Program43();
        iRet = obj.();
  System.out.println(String.format("%d", iRet));

  
}

}

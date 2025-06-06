/*
\nimport java.util.*;\n\npublic class Program44 {\n    public static Scanner scanner = new Scanner(System.in);
/*

4. Write a program which accepts number from user and return the frequency of 4 in it.

Time Complexity: O(n)

*/



public int CountFour(int iNo)
{
  int iCnt = 0, iDigit = 0;

  if (iNo < 0)
  {
    iNo = -iNo;
  }

  while (iNo != 0)
  {
    iDigit = iNo % 10;
    if (iDigit == 4)
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

  Program44 obj = new Program44();
        iRet = obj.();
  System.out.println(String.format("%d", iRet));

  
}

}

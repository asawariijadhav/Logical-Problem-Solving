/*
\nimport java.util.*;\n\npublic class Program42 {\n    public static Scanner scanner = new Scanner(System.in);
/*



Time Complexity:

*/








boolean ChkZero(int iNo)
{
  int iDigit = 0;
  if (iNo < 0)
    iNo = -iNo;
  while (iNo != 0)
  {
    iDigit = iNo % 10;
    if (iDigit == 0)
    {
      return true;
    }
    iNo = iNo / 10;
  }
  return false;
}

public static void main(String[] args)
{
  int iValue = 0;
  boolean bRet = false;

  System.out.println("Enter number:");
  iValue = scanner.nextInt();

  bRet = ChkZero(iValue);
  if (bRet == true)
  {
    System.out.println("It Contains Zero");
  }
  else
  {
    System.out.println("There is no Zero");
  }

  
}
}

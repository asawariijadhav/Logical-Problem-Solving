// Write a program which accept one number from user and print even factors of that number.
\nimport java.util.*;\n\npublic class Program13 {\n    public static Scanner scanner = new Scanner(System.in);




public static void DisplayEvenFactor(int iNo)
{
  int iCnt = 0;

  if (iNo <= 0)
  {
    iNo = -iNo;
  }

  for (iCnt = 1; iCnt < iNo; iCnt++) 
  {
    if ((iNo % iCnt == 0) && (iCnt % 2 == 0))
    {
      System.out.print(String.format("%d ", iCnt));
    }
  }
  System.out.println("");
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  System.out.print("Even factors (excluding the number) are: ");
  DisplayEvenFactor(iValue);

  
}

}

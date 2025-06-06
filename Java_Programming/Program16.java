/*
\nimport java.util.*;\n\npublic class Program16 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Write a program which accept number from user and display the multiplication of factors.

Input:  12
Output: 144  (1 * 2 * 3 * 4 * 6)

Input:  10
Output: 10  (1 * 2 * 5)

Input:   8
Output:   8  (1 * 2 * 4)

Time Complexity:
O(n) where n = iNo/2

*/



public static void MultFactors(int iNo)
{
  int iCnt = 0;
  int iMult = 1;

  for (iCnt = 1; iCnt <= iNo / 2; iCnt++)
  {
    if (iNo % iCnt == 0)
    {
      iMult *= iCnt;
    }
  }

  System.out.println(String.format("Multiplication of factors: %d", iMult));
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  MultFactors(iValue);

  
}

}

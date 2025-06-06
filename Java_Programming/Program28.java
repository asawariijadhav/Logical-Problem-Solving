/*
\nimport java.util.*;\n\npublic class Program28 {\n    public static Scanner scanner = new Scanner(System.in);
/*

3. Write a program which finds factorial of given number.

Input 1: 5
Output 1: 120

(Factorial: 5 × 4 × 3 × 2 × 1 = 120)

Time Complexity:O(1) – O(n) – One loop from 1 to n.

*/



public int Factorial(int iNo)
{
  int iCnt = 0;
  int iFact = 1;

  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    iFact = iFact * iCnt;
  }

  return iFact;
}

public static void main(String[] args)
{
  int iValue = 0;
  int iRet = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Program28 obj = new Program28();
        iRet = obj.();
  System.out.println(String.format("Factorial of number is %d", iRet));

  
}

}

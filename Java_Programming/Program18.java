/*
\nimport java.util.*;\n\npublic class Program18 {\n    public static Scanner scanner = new Scanner(System.in);
/*

3. Write a program which accept number from user and display all its non factors.

Input:  12
Output: 5   7   8   9   10   11

Input:  10
Output: 3   4   6   7   8   9

Input:   8
Output: 3   5   6   7

Time Complexity:
O(n) where n = iNo

*/



public static void NonFact(int iNo)
{
  int iCnt = 0;

  for (iCnt = 1; iCnt < iNo; iCnt++)
  {
    if (iNo % iCnt != 0)
    {
      System.out.print(String.format("%d  ", iCnt));
    }
  }
  System.out.println("");
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  NonFact(iValue);

  
}

}

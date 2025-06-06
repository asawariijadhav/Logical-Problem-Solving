/*
\nimport java.util.*;\n\npublic class Program30 {\n    public static Scanner scanner = new Scanner(System.in);
/*

5. Write a program which accepts number from user and displays its table in reverse.

Input: 2
Output:

20 18 16 14 12 10 8 6 4 2


Time Complexity:O(1) – O(1) – Fixed 10 iterations.

*/



public static void TableRev(int iNo)
{
  int iCnt = 0;
  for (iCnt = 10; iCnt >= 1; iCnt--)
  {
    System.out.print(String.format("%d ", iNo * iCnt));
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  TableRev(iValue);

  
}

}

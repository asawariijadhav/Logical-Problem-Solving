/*
\nimport java.util.*;\n\npublic class Program29 {\n    public static Scanner scanner = new Scanner(System.in);
/*

4. Write a program which accepts number from user and displays its table.

Input: 5
Output:

5 10 15 20 25 30 35 40 45 50

Time Complexity:O(1) – O(n) – One loop from 1 to n.

*/



public static void Table(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= 10; iCnt++)
  {
    System.out.print(String.format("%d ", iNo * iCnt));
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Table(iValue);

  
}

}

/*
\nimport java.util.*;\n\npublic class Program55 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5. Accept number from user and display below pattern.
Input: 8
Output:2    4    6    8    10    12    14    16



*/



public static void Pattern(int iNo)
{
  int iCnt = 0;
  for (iCnt = 1; iCnt <= iNo; iCnt++)
  {
    System.out.print(String.format("%d\t", iCnt * 2));
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.println("Enter number of elements");
  iValue = scanner.nextInt();

  Pattern(iValue);

  
}

}

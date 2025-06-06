/*
\nimport java.util.*;\n\npublic class Program41 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Write a program which accepts number from user and display its digits in reverse order.

Time Complexity: O(N) where N is the number of digits

*/



public static void DisplayDigit(int iNo)
{
  int iDigit = 0;

  while (iNo != 0)
  {
    iDigit = iNo % 10;
    System.out.println(String.format("%d", iDigit));
    iNo = iNo / 10;
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.println("Enter number:");
  iValue = scanner.nextInt();

  DisplayDigit(iValue);

  
}

}

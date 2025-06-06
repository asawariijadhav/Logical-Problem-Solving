/*
\nimport java.util.*;\n\npublic class Program26 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Write a program which accepts number from user and:
If number is less than 50 then print “Small”

If number is greater than 50 and less than 100 then print “Medium”

If it is greater than 100 then print “Large”

Input 1: 75
Output 1: Medium

Time Complexity:O(1) – Constant time. No loops involved.

*/



public static void Number(int iNo)
{
  if (iNo < 50)
  {
    System.out.println("Small");
  }
  else if (iNo >= 50 && iNo <= 100)
  {
    System.out.println("Medium");
  }
  else
  {
    System.out.println("Large");
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Number(iValue);

  
}

}

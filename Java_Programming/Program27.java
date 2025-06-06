/*
\nimport java.util.*;\n\npublic class Program27 {\n    public static Scanner scanner = new Scanner(System.in);
/*

2. Accept single digit number from user and print it into word.

Input 1: 3
Output 1: Three

Time Complexity:O(1) – O(1) – Only one decision block is checked.

*/



public static void Display(int iNo)
{
  switch (iNo)
  {
  case 0:
    System.out.println("Zero");
    break;
  case 1:
    System.out.println("One");
    break;
  case 2:
    System.out.println("Two");
    break;
  case 3:
    System.out.println("Three");
    break;
  case 4:
    System.out.println("Four");
    break;
  case 5:
    System.out.println("Five");
    break;
  case 6:
    System.out.println("Six");
    break;
  case 7:
    System.out.println("Seven");
    break;
  case 8:
    System.out.println("Eight");
    break;
  case 9:
    System.out.println("Nine");
    break;
  default:
    System.out.println("Invalid Number");
  }
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  Display(iValue);

  
}

}

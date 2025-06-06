// Write a program which accept one number from user and print that number of even numbers on screen.
\nimport java.util.*;\n\npublic class Program11 {\n    public static Scanner scanner = new Scanner(System.in);




public static void PrintEven(int iNo)
{
  int iCnt = 1;

  if (iNo <= 0)
  {
    System.out.println("Please enter a positive number.");
    return;
  }

  while (iCnt <= iNo)
  {
    System.out.print(String.format("%d ", iCnt * 2)); 
    iCnt++;
  }

  System.out.println("");
}

public static void main(String[] args)
{
  int iValue = 0;

  System.out.print("Enter number: ");
  iValue = scanner.nextInt();

  PrintEven(iValue);

  
}

}

/*
\nimport java.util.*;\n\npublic class Program32 {\n    public static Scanner scanner = new Scanner(System.in);
/*

2. Accept amount in US dollars and return its corresponding value in Indian currency. (1 USD = 70 INR)


Input: 10
Value in INR is: 700

Time Complexity: O(1)


*/



public int DollarToINR(int iNo)
{
  return iNo * 70;
}

public static void main(String[] args)
{
  int iValue = 0;
  int iRet = 0;

  System.out.println("Enter the number of USD:");
  iValue = scanner.nextInt();

  Program32 obj = new Program32();
        iRet = obj.();
  System.out.println(String.format("Value in INR is: %d", iRet));

  
}

}

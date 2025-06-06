/*
\nimport java.util.*;\n\npublic class Program40 {\n    public static Scanner scanner = new Scanner(System.in);
/*

5. Write a program which accepts area in square feet and convert it into square meter. (1 Square feet = 0.0929 Square meter)

Time Complexity: O(1)

*/



double SquareMeter(int Value)
{
  double Area = 0.0;
  Area = Value * 0.0929;
}

public static void main(String[] args)
{
  int Value = 0;
  double dRet = 0.0;

  System.out.println("Enter area in square feet:");
  Value = scanner.nextInt();

  double dRet = SquareMeter(Value);
  System.out.println(String.format("Area in square meter: %f", dRet));

  
}

}

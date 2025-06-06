/*
\nimport java.util.*;\n\npublic class Program39 {\n    public static Scanner scanner = new Scanner(System.in);
/*

4. Write a program which accepts temperature in Fahrenheit and convert it into Celsius. (C = (F - 32) * (5/9))

Input: Fahrenheit = 111.00

Output: Celsius = 43.888889


Time Complexity: O(1)

*/



double FhtoCs(float F)
{
  double Celsius = 0.0;
  Celsius = (F - 32) * (5.0 / 9.0);
  return Celsius;
}

public static void main(String[] args)
{
  float F = 0.0;
  double dRet = 0.0;

  System.out.println("Enter temperature in Fahrenheit:");
  F = scanner.nextInt();

  double dRet = FhtoCs(F);
  System.out.println(String.format("Temperature in Celsius: %f", dRet));

  
}

}

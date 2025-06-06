/*
\nimport java.util.*;\n\npublic class Program36 {\n    public static Scanner scanner = new Scanner(System.in);
/*

1. Write a program which accepts radius of circle from user and calculate its area. (Area = π * Radius * Radius)

Input: Radius = 5.3
Output:Area = 88.2026

Time Complexity: O(1)

*/



double CircleArea(float Radius)
{
  double Area = 0;
  double Pi = 3.14;
  Area = Pi * Radius * Radius;
  return Area;
}

public static void main(String[] args)
{
  float Radius = 0.0;
  double dRet = 0.0;

  System.out.println("Enter the radius:");
  Radius = scanner.nextInt(); 

  dRet = CircleArea(Radius);     
  System.out.println(String.format("Area is: %f", dRet)); 

  
}

}

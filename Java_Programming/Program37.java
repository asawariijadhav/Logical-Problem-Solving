/*
\nimport java.util.*;\n\npublic class Program37 {\n    public static Scanner scanner = new Scanner(System.in);
/*

2. Write a program which accepts width & height of rectangle from user and calculate its area. (Area = Width × Height)

Input: Width = 5.3
Height = 9.78

Output:Area = 51.834


Time Complexity: O(1)

*/



double RectangleArea(float Width, float Height)
{
  double Area;

  Area = Width * Height;
  return Area;
}
public static void main(String[] args)
{
  float Width = 0.0, Height = 0.0;
  double dRet = 0.0;

  System.out.println("Enter Width:");
  Width = scanner.nextInt();

  System.out.println("Enter Height:");
  Height = scanner.nextInt();

  double dRet = RectangleArea(Width, Height);
  System.out.println(String.format("Area is: %f", dRet));

  
}

}

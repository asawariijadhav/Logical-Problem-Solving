/*
\nimport java.util.*;\n\npublic class Program38 {\n    public static Scanner scanner = new Scanner(System.in);
/*

3. Write a program which accepts distance in kilometer and convert it into meter. (1 KM = 1000 Meter)

Input: Distance = 12

Output:Meter = 12000


Time Complexity: O(1)

*/



public int KMtoMeter(int KM)
{
  int Meter = 0;
  Meter = KM * 1000;
  return Meter;
}
public static void main(String[] args)
{
  int KM = 0;
  int iRet = 0;

  System.out.println("Enter distance in KM:");
  KM = scanner.nextInt();

  int Program38 obj = new Program38();
        iRet = obj.();
  System.out.println(String.format("Distance in meter is: %d", iRet));

  
}

}

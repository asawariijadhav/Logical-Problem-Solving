/*
\nimport java.util.*;\n\npublic class Program99 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4.Accept N numbers from the user and accept Range, Display elements within a given range.
Input 1:N = 6
Start = 60
End = 90
Elements = 85 66 3 76 93 88
Output: 66 76 88

Input 2:N = 6
Start = 30
End = 50
Elements = 85 66 3 76 93 88

Output:


*/


#include <stdlib.h>

public static void Range(int Arr[], int iLength, int iStart, int iEnd)
{
  int i = 0;
  for (i = 0; i < iLength; i++)
  {
    if (Arr[i] >= iStart && Arr[i] <= iEnd)
    {
      System.out.print(String.format("%d ", Arr[i]));
    }
  }
  System.out.println("");
}

public static void main(String[] args)
{
  int iSize = 0, iCnt = 0, iValue1 = 0, iValue2 = 0;
  int *p = NULL;

  System.out.print("Enter number of elements: ");
  iSize = scanner.nextInt();

  System.out.print("Enter the starting point: ");
  iValue1 = scanner.nextInt();

  System.out.print("Enter the ending point: ");
  iValue2 = scanner.nextInt();

  p = (int *)malloc(iSize * sizeof(int));
  if (p == NULL)
  {
    System.out.println("Unable to allocate memory");
    return -1;
  }

  System.out.println(String.format("Enter %d elements:", iSize));
  for (iCnt = 0; iCnt < iSize; iCnt++)
  {
    System.out.print(String.format("Enter element %d: ", iCnt + 1));
    scanf("%d", &p[iCnt]);
  }

  System.out.print(String.format("Elements in range [%d, %d]: ", iValue1, iValue2));
  Range(p, iSize, iValue1, iValue2);

  free(p);
  
}

}

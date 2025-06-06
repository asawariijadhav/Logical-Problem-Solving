/*
\nimport java.util.*;\n\npublic class Program91 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1.Accept N numbers and return frequency of even numbers
Input: N = 6

Elements: 85 66 3 80 93 88

Output: 3


*/


#include <stdlib.h>

public int CountEven(int Arr[], int iLength)
{
  int iCnt = 0, iCount = 0;
  for (iCnt = 0; iCnt < iLength; iCnt++)
  {
    if (Arr[iCnt] % 2 == 0)
    {
      iCount++;
    }
  }
  return iCount;
}

public static void main(String[] args)
{
  int iSize = 0, iRet = 0, iCnt = 0;
  int *p = NULL;

  System.out.print("Enter number of elements: ");
  iSize = scanner.nextInt();

  p = (int *)malloc(iSize * sizeof(int));

  if (p == NULL)
  {
    System.out.print("Unable to allocate memory");
    return -1;
  }

  System.out.println(String.format("Enter %d elements:", iSize));
  for (iCnt = 0; iCnt < iSize; iCnt++)
  {
    System.out.print(String.format("Enter element %d: ", iCnt + 1));
    scanf("%d", &p[iCnt]);
  }

  Program91 obj = new Program91();
        iRet = obj.();
  System.out.println(String.format("Result is %d", iRet));

  free(p);
  
}

}

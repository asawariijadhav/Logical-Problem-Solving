/*
\nimport java.util.*;\n\npublic class Program94 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4.Accept N numbers and return frequency of number 11 from it.

Input:N = 6

Elements: 85 66 3 15 93 88

Output: 0

Input:N = 6

Elements: 85 11 3 15 11 11

Output: 2

*/


#include <stdlib.h>

public int Frequency(int Arr[], int iLength)
{
  int iCnt = 0, iCount = 0;
  for (iCnt = 0; iCnt < iLength; iCnt++)
  {
    if (Arr[iCnt] == 11)
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

  Program94 obj = new Program94();
        iRet = obj.();
  System.out.println(String.format("%d", iRet));

  free(p);
  
}

}

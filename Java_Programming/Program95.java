/*
\nimport java.util.*;\n\npublic class Program95 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5.Accept N numbers and one another number, return frequency of that number
Input:N = 6
      No = 66

Elements: 85 66 3 66 93 88

Output: 0

Input:N = 6
     No = 12

Elements: 85 11 3 15 11 111

Output: 2


*/


#include <stdlib.h>

public int Frequency(int Arr[], int iLength, int iNo)
{
  int iCnt = 0, iCount = 0;

  for (iCnt = 0; iCnt < iLength; iCnt++)
  {
    if (Arr[iCnt] == iNo)
    {
      iCount++;
    }
  }
  return iCount;
}

public static void main(String[] args)
{
  int iSize = 0, iValue = 0, iRet = 0, iCnt = 0;
  int *p = NULL;

  System.out.print("Enter number of elements: ");
  iSize = scanner.nextInt();

  System.out.print("Enter the number to find frequency: ");
  iValue = scanner.nextInt();

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

  Program95 obj = new Program95();
        iRet = obj.();
  System.out.println(String.format("%d", iRet));

  free(p);
  
}

}

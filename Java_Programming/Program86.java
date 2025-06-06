/*
\nimport java.util.*;\n\npublic class Program86 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1.Accept N numbers from user and return the difference between the summation of even elements and summation of odd elements.

Input:
N = 6
Elements: 85 66 3 80 93 88

Output:
53  (234 - 181)

*/


#include <stdlib.h>

public int Difference(int Arr[], int iLength)
{
  int iCnt = 0;
  int iEvenSum = 0;
  int iOddSum = 0;

  for (iCnt = 0; iCnt < iLength; iCnt++)
  {
    if (Arr[iCnt] % 2 == 0)
    {
      iEvenSum = iEvenSum + Arr[iCnt];
    }
    else
    {
      iOddSum = iOddSum + Arr[iCnt];
    }
  }

  return iEvenSum - iOddSum;
}

public static void main(String[] args)
{
  int iSize = 0, iRet = 0, iCnt = 0;
  int *p = NULL;

  System.out.print("Enter number of elements: ");
  iSize = scanner.nextInt();

  if (iSize <= 0)
  {
    System.out.println("Invalid size.");
    return -1;
  }

  p = (int *)malloc(iSize * sizeof(int));

  if (p == NULL)
  {
    System.out.println("Unable to allocate memory.");
    return -1;
  }

  System.out.println(String.format("Enter %d elements:", iSize));
  for (iCnt = 0; iCnt < iSize; iCnt++)
  {
    System.out.print(String.format("Enter element %d: ", iCnt + 1));
    scanf("%d", &p[iCnt]);
  }

  Program86 obj = new Program86();
        iRet = obj.();
  System.out.println(String.format("Result is: %d", iRet));

  free(p);
  
}

}

/*
\nimport java.util.*;\n\npublic class Program100 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5.Accept N numbers from the user and  Return product of all odd elements
Input:N: 6
Elements: 15 66 3 70 10 88
Output: 45

Input:N: 6
NO: 12
Elements: 44 66 72 70 10 88
Output: 0

*/


#include <stdlib.h>

public int Product(int Arr[], int iLength)
{
  int i = 0, iProduct = 1;
  int hasOdd = 0;

  for (i = 0; i < iLength; i++)
  {
    if (Arr[i] % 2 != 0)
    {
      iProduct *= Arr[i];
      hasOdd = 1;
    }
  }

  if (hasOdd == 0)
  {
    
  }

  return iProduct;
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
    System.out.println("Unable to allocate memory");
    return -1;
  }

  System.out.println(String.format("Enter %d elements:", iSize));
  for (iCnt = 0; iCnt < iSize; iCnt++)
  {
    System.out.print(String.format("Enter element %d: ", iCnt + 1));
    scanf("%d", &p[iCnt]);
  }

  Program100 obj = new Program100();
        iRet = obj.();
  System.out.println(String.format("Product of odd elements is: %d", iRet));

  free(p);
  
}

}

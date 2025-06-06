/*
\nimport java.util.*;\n\npublic class Program96 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1.Accept N numbers from the user and accept one another number as NO. Check whether NO is present or not.
Input:N: 6
NO: 66
Elements: 85 66 3 66 93 88


Output: Number is present


Input:N: 6
NO: 12
Elements: 85 11 3 66 93 88

Output: Number is not present

*/


#include <stdlib.h>






boolean Check(int Arr[], int iLength, int iNo)
{
  int i = 0;
  for (i = 0; i < iLength; i++)
  {
    if (Arr[i] == iNo)
    {
      return true;
    }
  }
  return false;
}

public static void main(String[] args)
{
  int iSize = 0, iRet = 0, iCnt = 0, iValue = 0;
  int *p = NULL;
  boolean bRet = false;

  System.out.print("Enter number of elements: ");
  iSize = scanner.nextInt();

  System.out.print("Enter the number to search: ");
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

  bRet = Check(p, iSize, iValue);

  if (bRet == true)
  {
    System.out.println("Number is present");
  }
  else
  {
    System.out.println("Number is not present");
  }

  free(p);
  
}

}

/*
\nimport java.util.*;\n\npublic class Program93 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3.Accept N numbers and check whether any number contains digit 11 or not

Input:N = 6

Elements: 85 66 11 80 93 88

Output: 11 is present

Input:N = 6

Elements: 85 66 3 80 93 88

Output: 11 is absent



*/


#include <stdlib.h>




boolean Check(int Arr[], int iLength)
{
  int iCnt = 0;
  for (iCnt = 0; iCnt < iLength; iCnt++)
  {
    if (Arr[iCnt] == 11)
    {
      return true;
    }
  }
  return false;
}

public static void main(String[] args)
{
  int iSize = 0, iCnt = 0;
  boolean bRet = false;
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

  bRet = Check(p, iSize);

  if (bRet == true)
    System.out.println("11 is present");
  else
    System.out.println("11 is absent");

  free(p);
  
}

}

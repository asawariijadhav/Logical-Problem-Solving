/*
\nimport java.util.*;\n\npublic class Program97 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2.Accept N numbers from user and accept one number as NO. Return the index of the first occurrence of that NO.
Input:N: 6
NO: 66
Elements: 85 66 3 66 93 88
Output: First occurrence of number is 1

Input:N:6
NO: 12
Elements: 85 11 3 66 93 88
Output: There is no such number


*/


#include <stdlib.h>

public int FirstOcc(int Arr[], int iLength, int iNo)
{
  int i = 0;
  for (i = 0; i < iLength; i++)
  {
    if (Arr[i] == iNo)
    {
      return i; 
    }
  }
  return -1; 
}

public static void main(String[] args)
{
  int iSize = 0, iRet = 0, iCnt = 0, iValue = 0;
  int *p = NULL;

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

  Program97 obj = new Program97();
        iRet = obj.();

  if (iRet == -1)
  {
    System.out.println("There is no such number");
  }
  else
  {
    System.out.println(String.format("First occurrence of number is %d", iRet));
  }

  free(p);
  
}

}

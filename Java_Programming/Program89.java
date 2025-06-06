/*
\nimport java.util.*;\n\npublic class Program89 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4. Accept N numbers from user and display all such elements which are  divisible by 3 and  5.

Input: N : 6

Elements: 85 66 3 15 93 88

Output: 15
*/


#include <stdlib.h>

public static void Display(int Arr[], int iLength)
{
  int iCount = 0;
  for (int i = 0; i < iLength; i++)
  {
    if ((Arr[i] % 3 == 0) && (Arr[i] % 5 == 0))
    {
      System.out.print(String.format("%d ", Arr[i]));
      iCount++;
    }
  }

  if (iCount == 0)
  {
    System.out.print("None");
  }
  System.out.println(String.format("\nTotal matching elements: %d", iCount));
}

public static void main(String[] args)
{
  int iSize = 0, iCnt = 0;
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

  System.out.println("Elements divisible by both 3 and 5 are:");
  Display(p, iSize);

  free(p);
  
}

}

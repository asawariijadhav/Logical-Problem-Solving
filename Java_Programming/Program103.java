/*
\nimport java.util.*;\n\npublic class Program103 {\n    public static Scanner scanner = new Scanner(System.in);
/*
3. Accept N numbers from user and return the difference between largest and smallest number.
Input:N: 6

Elements: 85 66 3 66 93 88
Output: 90(93-3)

*/



public int Difference(int Arr[], int iLength)
{
  int iMax = Arr[0], iMin = Arr[0], i = 0;

  for (i = 1; i < iLength; i++)
  {
    if (Arr[i] > iMax)

      iMax = Arr[i];

    if (Arr[i] < iMin)

      iMin = Arr[i];
  }

  return iMax - iMin;
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

  Program103 obj = new Program103();
        iRet = obj.();
  System.out.println(String.format("Difference is %d", iRet));

  free(p);
  
}

}

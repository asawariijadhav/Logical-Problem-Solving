/*
\nimport java.util.*;\n\npublic class Program102 {\n    public static Scanner scanner = new Scanner(System.in);
/*
2. Accept N numbers from user and return the smallest number.

Input:N: 6

Elements: 85 66 3 66 93 88
Output: 3

*/







public int Minimum(int Arr[], int iLength)
{
  int iMin = Arr[0], i = 0;
  for (i = 1; i < iLength; i++)
  {
    if (Arr[i] < iMin)
    {
      iMin = Arr[i];
    }
  }
  return iMin;
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

  Program102 obj = new Program102();
        iRet = obj.();
  System.out.println(String.format("Smallest Number is %d", iRet));

  free(p);
  
}

}

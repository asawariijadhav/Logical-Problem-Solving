
\nimport java.util.*;\n\npublic class Program101 {\n    public static Scanner scanner = new Scanner(System.in);

/*
1.Accept N numbers from the user and accept one another number as NO. Check whether NO is present or not.

Input:N: 6

Elements: 85 66 3 66 93 88
Output: 93

*/







public int Maximum(int Arr[], int iLength)
{
  int iMax = Arr[0], i = 0;
  for (i = 1; i < iLength; i++)
  {
    if (Arr[i] > iMax)
    {
      iMax = Arr[i];
    }
  }
  return iMax;
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

  Program101 obj = new Program101();
        iRet = obj.();
  System.out.println(String.format("Largest Number is %d", iRet));

  free(p);
  
}

}

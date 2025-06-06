/*
\nimport java.util.*;\n\npublic class Program105 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5. Accept N numbers from user and display summation of digits of each number.

Input:N: 6

Elements: 8225 665 3 76 953 858
Output: 17 17 3 13 17 21

*/



public static void DigitsSum(int Arr[], int iLength)
{
  int i = 0, iDigit = 0, iSum = 0, iTemp = 0;

  for (i = 0; i < iLength; i++)
  {
    iTemp = Arr[i];
    iSum = 0;
    while (iTemp != 0)
    {
      iDigit = iTemp % 10;
      iSum += iDigit;
      iTemp /= 10;
    }
    System.out.print(String.format("%d ", iSum));
  }
  System.out.println("");
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

  DigitsSum(p, iSize);

  free(p);
  
}

}

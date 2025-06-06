/*
\nimport java.util.*;\n\npublic class Program104 {\n    public static Scanner scanner = new Scanner(System.in);
/*
4. Accept N numbers from user and display all such numbers which contain 3 digits in it.

Input:N: 6

Elements: 8225 665 3 76 953 858
Output: 665 953 858

*/



public static void Digits(int Arr[], int iLength)
{
  int i = 0;
  for (i = 0; i < iLength; i++)
  {
    if (Arr[i] >= 100 && Arr[i] <= 999)
    {
      System.out.print(String.format("%d ", Arr[i]));
    }
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

  Digits(p, iSize);

  free(p);
  
}

}

/*
\nimport java.util.*;\n\npublic class Program90 {\n    public static Scanner scanner = new Scanner(System.in);
/*
5. Accept N numbers from user and display all such elements which are multiples by 11.

Input: N : 6

Elements: 85 66 3 55 93 88

Output: 66 55 88
*/


#include <stdlib.h>

public static void Display(int Arr[], int iLength)
{
    int iCount = 0;
    for (int i = 0; i < iLength; i++)
    {
        if (Arr[i] % 11 == 0)
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

    System.out.println("Elements that are multiples of 11 are:");
    Display(p, iSize);

    free(p);
    
}

}

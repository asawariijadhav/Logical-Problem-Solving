/*
\nimport java.util.*;\n\npublic class Program116 {\n    public static Scanner scanner = new Scanner(System.in);
/*
1. Write a program which accepts string from user and count number of capital characters.

Input:
"Marvellous Multi OS"

Output:
4

*/



int CountCapital(char *str)
{
    int iCnt = 0;

    while (*str != '\0')
    {
        if ((*str >= 'A') && (*str <= 'Z'))
        {
            iCnt++;
        }
        str++;
    }

    return iCnt;
}

public static void main(String[] args)
{
    char arr[20];
    int iRet = 0;

    System.out.print("Enter string: ");
    arr = scanner.nextInt();

    iRet = CountCapital(arr);

    System.out.println(String.format("%d", iRet));

    
}

}

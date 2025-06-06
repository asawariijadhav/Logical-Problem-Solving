/*

4. Write a program which accepts a number from user and returns the multiplication of all digits.

Input : 2395    → Output : 270  (2 * 3 * 9 * 5)
Input : 1018    → Output : 8    (1 * 0 * 1 * 8 = 0, but often zero is ignored)
Input : 9440    → Output : 144
Input : 922432  → Output : 864


Time Complexity: O(n)

 */

import java.util.*;

public class Program49 {

    public static Scanner scanner = new Scanner(System.in);

    public int MultDigits(int iNo) {
        int iDigit = 0, iMult = 1;
        int hasNonZero = 0;

        if (iNo < 0) {
            iNo = -iNo;
        }

        while (iNo != 0) {
            iDigit = iNo % 10;

            if (iDigit != 0) {
                iMult = iMult * iDigit;
                hasNonZero = 1;
            }

            iNo = iNo / 10;
        }

        // Use boolean condition in ternary operator
        return (hasNonZero != 0) ? iMult : 0;
    }

    public static void main(String[] args) {
        int iValue = 0, iRet = 0;

        System.out.print("Enter number: ");
        iValue = scanner.nextInt();

        Program49 obj = new Program49();

        // Call method MultDigits on obj
        iRet = obj.MultDigits(iValue);

        System.out.println(String.format("%d", iRet));

        scanner.close();
    }

}

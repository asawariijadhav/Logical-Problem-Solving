// Accept number from user and check whether number is even or odd.

import java.util.*;

public class Program10 {

    public static Scanner scanner = new Scanner(System.in);

    // Non-static method
    public boolean ChkEven(int iNo) {
        return (iNo % 2 == 0);
    }

    public static void main(String[] args) {
        int iValue = 0;
        boolean bRet = false;

        System.out.print("Enter number: ");
        iValue = scanner.nextInt();

        // Create an object to call the non-static method
        Program10 obj = new Program10();
        bRet = obj.ChkEven(iValue);

        if (bRet) {
            System.out.print("Number is Even");
        } else {
            System.out.print("Number is Odd");
        }

        scanner.close();
    }
}

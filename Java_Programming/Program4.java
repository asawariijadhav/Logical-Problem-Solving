// Accept one number from that user and print number of * on screen.

import java.util.*;

public class Program4 {

    // Accept one number from user and check if divisible by 5
    public static boolean Check(int iNo) {
        return (iNo % 5) == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int iValue;
        boolean bRet;

        System.out.print("Enter number: ");
        iValue = scanner.nextInt();

        bRet = Check(iValue);

        if (bRet) {
            System.out.print("Divisible by 5");
        } else {
            System.out.print("Not Divisible by 5");
        }
    }
}

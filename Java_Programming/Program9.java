// Accept one number from user and display first number in second number of times.

import java.util.*;

public class Program9 {

    public static Scanner scanner = new Scanner(System.in);

    public static void Display(int iNo, int iFrequency) {
        int iCnt = 0;
        for (iCnt = 0; iCnt < iFrequency; iCnt++) {
            System.out.print(String.format("%d ", iNo));
        }
    }

    public static void main(String[] args) {
        int iValue = 0;
        int iCount = 0;

        System.out.print("Enter number: ");
        iValue = scanner.nextInt();

        System.out.print("Enter frequency: ");
        iCount = scanner.nextInt();

        Display(iValue, iCount);

    }

}

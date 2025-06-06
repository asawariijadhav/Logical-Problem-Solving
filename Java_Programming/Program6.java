// Accept one number from user and print that number of * on screen.

import java.util.*;

public class Program6 {

    public static Scanner scanner = new Scanner(System.in);

    public static void Display(int iNo) {
        int iCnt = 0;
        while (iCnt < iNo) {
            System.out.print("* ");
            iCnt++;
        }
    }

    public static void main(String[] args) {
        int iValue = 0;

        System.out.print("Enter number: ");
        iValue = scanner.nextInt();

        Display(iValue);

    }

}

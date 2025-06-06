// Accept one number from user and print that number of * on screen.

import java.util.*;

public class Program7 {

    public static Scanner scanner = new Scanner(System.in);

    public static void Display(int iNo) {
        while (iNo > 0) {
            System.out.print("* ");
            iNo--;
        }
    }

    public static void main(String[] args) {
        int iValue = 0;

        System.out.print("Enter number: ");
        iValue = scanner.nextInt();

        Display(iValue);

    }

}

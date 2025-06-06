// Accept one number from user If number < 10 print “Hello” otherwise “Demo”.

import java.util.*;

public class Program8 {

    public static Scanner scanner = new Scanner(System.in);

    public static void Display(int iNo) {
        if (iNo < 10) {
            System.out.print("Hello");
        } else {
            System.out.print("Demo");
        }
    }

    public static void main(String[] args) {
        int iValue = 0;

        System.out.print("Enter number: ");
        iValue = scanner.nextInt();

        Display(iValue);

    }

}

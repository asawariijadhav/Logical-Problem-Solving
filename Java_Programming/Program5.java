// Accept one number from user and print that number of * on screen.

public class Program5 {

    public static void Accept(int iNo) {
        int iCnt = 0;

        for (iCnt = 0; iCnt < iNo; iCnt++) {
            System.out.print("* ");
        }
    }

    public static void main(String[] args) {
        int iValue = 0;
        iValue = 5;

        Accept(iValue);

    }

}

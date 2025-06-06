// Program to print 5 to 1 numbers on screen.

public class Program3 {

    public static void Display() {
        int iCnt = 5;
        while (iCnt >= 1) {
            System.out.println(String.format("%d", iCnt));
            iCnt--;
        }
    }

    public static void main(String[] args) {
        Display();

    }

}

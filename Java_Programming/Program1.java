// Program is divide two numbers.

public class Program1 {

    int Divide(int iNo1, int iNo2) {
        int iAns = 0;

        if (iNo2 == 0) {
            return -1;
        }

        iAns = iNo1 / iNo2;

        return iAns;
    }

    public static void main(String[] args) {
        Program1 obj = new Program1(); // create object
        int iValue1 = 15, iValue2 = 5;
        int iRet = 0;

        iRet = obj.Divide(iValue1, iValue2); // call using object

        System.out.print(String.format("Division is %d", iRet));
    }
}

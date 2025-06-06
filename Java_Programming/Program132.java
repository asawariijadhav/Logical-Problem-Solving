
/*
2: Copy first N characters (strncpy implementation)

Input:"Marvellous Multi OS", 10

Output:Marvellous

 */
import java.util.Scanner;

public class Program132 {

    // Returns first iCnt characters of src, or full string if shorter
    public static String StrNCpyX(String src, int iCnt) {
        if (iCnt <= 0 || src == null) {
            return "";
        }
        if (iCnt > src.length()) {
            iCnt = src.length();
        }

        return src.substring(0, iCnt);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        System.out.print("Enter number of characters to copy: ");
        int count = scanner.nextInt();

        String result = StrNCpyX(input, count);

        System.out.println("Copied first " + count + " characters: " + result);

        scanner.close();
    }
}

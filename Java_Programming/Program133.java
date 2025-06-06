
/*
3. Write a program which accept string from user and copy capital characters of that string into another string.

Input:

Output:

"Marvellous Multi OS"

"MMOS"



 */
import java.util.Scanner;

public class Program133 {

    // Returns a new string with only uppercase letters from src
    public static String StrCpyCap(String src) {
        StringBuilder dest = new StringBuilder();

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                dest.append(ch);
            }
        }

        return dest.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        String result = StrCpyCap(input);

        System.out.println("Capital letters copied: " + result);

        scanner.close();
    }
}

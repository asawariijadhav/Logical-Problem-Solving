/*
4. Write a program which accept string from user and copy small characters of that string into another string.

Input:

Output:

"Marvellous multi OS"

"arvellous multi"


 */

import java.util.Scanner;

public class Program134 {

    // Returns a new string with only lowercase letters from src
    public static String StrCpySmall(String src) {
        StringBuilder dest = new StringBuilder();

        for (int i = 0; i < src.length(); i++) {
            char ch = src.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                dest.append(ch);
            }
        }

        return dest.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        String result = StrCpySmall(input);

        System.out.println("Small letters copied: " + result);

        scanner.close();
    }
}

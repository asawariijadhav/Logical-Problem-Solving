/*
5. Write a program which accepts 2 strings from user and concatenates second string after first string.
(Implement strcat() function).

Input:
"Marvellous Infosystems" "Logic Building"

Output:
"Marvellous Infosystems Logic Building"
 */

import java.util.Scanner;

public class Program135 {

    // Custom strcat-like method: concatenates src2 to src1 and returns the result
    public static String StrCatX(String src1, String src2) {
        // Simple manual concatenation by returning combined string
        return src1 + " " + src2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

        String result = StrCatX(str1, str2);

        System.out.println("Concatenated string: " + result);

        scanner.close();
    }
}

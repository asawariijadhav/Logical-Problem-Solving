
/*
1. Copy entire string (strcpy implementation)

Input:"Marvellous Multi OS"


Output:Marvellous Multi OS




 */
import java.util.Scanner;

public class Program131 {

    // Returns a copy of the entire string
    public static String StrCpyX(String src) {
        if (src == null) {
            return "";
        }
        return new String(src);  // Returns a new String object with same content
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string: ");
        String input = scanner.nextLine();

        String result = StrCpyX(input);

        System.out.println("Copied string: " + result);

        scanner.close();
    }
}

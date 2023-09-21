package class11;

import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isPalindrome;

        System.out.println("Enter a string");
        String inpStr = scanner.next();
        String str = "";

        for (int i = inpStr.length() - 1; i >= 0; --i) {
            str = str + inpStr.charAt(i);
        }

        if (inpStr.equalsIgnoreCase(str)) {
            isPalindrome = true;
        }

        else {
            isPalindrome = false;
        }

        System.out.println(isPalindrome);
    }
}

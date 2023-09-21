package class14;

import java.util.Scanner;

public class reverseString {

    public static String reverseStr (String str) {
        String newStr = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }
        return newStr;
    }


    public static void main(String[] args) {

        System.out.println(reverseStr("Hello world"));

    }
}

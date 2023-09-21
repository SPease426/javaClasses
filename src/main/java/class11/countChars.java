package class11;

import java.util.Scanner;
import java.util.Arrays;

public class countChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a combination using letters, numbers, and special characters");
        String combination = scanner.next();
        int numLetters = 0;

        combination = combination.replaceAll("[^abdAZ]", "");
        numLetters = combination.length();

        System.out.println("Number of letters using abdAZ is " + numLetters);


    }
}

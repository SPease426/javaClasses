package class11;

import java.util.Scanner;

public class reverseWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // This  > sihT
        // is > si
        // a

        System.out.println("Enter more than one word:");
        String str = scanner.nextLine();
        String[] words = str.split(" ");

        for (int i = 0; i < words.length; i++) {
            for (int j = words[i].length() - 1; j >= 0; j--) {
                System.out.print(words[i].charAt(j));
            }
            System.out.print(" ");

        }
    }
}

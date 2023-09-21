package class11;

import java.util.Scanner;

public class noSpaces {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence");
        String statement = scanner.nextLine();

        String newStr = statement.replaceAll(" ", "");
        System.out.println(newStr);
    }
}

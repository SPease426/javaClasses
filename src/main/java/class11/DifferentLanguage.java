package class11;

import java.util.Scanner;

public class DifferentLanguage {
    public void diffLanguage() {
        String language;
        String diffWord = "";
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a language");
        language = scanner.next();

        if (language.equalsIgnoreCase("Spanish")) {
            System.out.println("Hello in Spanish is Hola");
        }
        else if (language.equalsIgnoreCase("Japanese")) {
            System.out.println("Hello in Japanese is Konichiwa");
        }
        else if (language.equalsIgnoreCase("French")) {
            System.out.println("Hello in French is bonjour");
        }
        else {
            System.out.println("Not a listed language");
        }
    }

    public static void main(String[] args) {
        DifferentLanguage newLanguage = new DifferentLanguage();
        newLanguage.diffLanguage();
    }
}

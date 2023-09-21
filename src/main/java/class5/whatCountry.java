package class5;

import java.util.Scanner;

public class whatCountry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a country");
        String country = scanner.nextLine();
        country = country.toLowerCase();

        switch (country) {

            case "united states of america":
                System.out.println("Language is English");
                break;
            case "mexico":
                System.out.println("Language is Spainish");
                break;
            case "japan":
                System.out.println("Language is Japanese");
                break;
            case "china":
                System.out.println("Language is Chinese");
                break;
            case "germany":
                System.out.println("Language is German");
                break;
            default:
                System.out.println("Country not supported");

        }
    }
}

package class11;

import java.util.Scanner;

public class babyNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mom's first name: ");
        String momName = scanner.next();

        System.out.println("Dad's first name: ");
        String dadName = scanner.next();

        System.out.println("boy or girl");
        String gender = scanner.next();

        if (gender.equalsIgnoreCase("Boy")) {

            String boyName = dadName.substring(0,3) + momName.substring(2);
            System.out.println("Suggested baby name is: " + boyName.toUpperCase());
        }

        else if  (gender.equalsIgnoreCase("Girl")) {
            String girlName = momName.substring(0,2) + dadName.substring(3);
            System.out.println("Suggested baby name is: " + girlName.toUpperCase());
        }
    }
}

package class4;


import java.util.Scanner;

public class creditCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you own a credit card?");
        String yourAnswer = scanner.next();

        if ((yourAnswer.equals("yes")) || (yourAnswer.equals("Yes"))) {
            System.out.println("What is the balance on your credit card?");
            int creditCardBalance = scanner.nextInt();

            if (creditCardBalance > 1000) {
                System.out.println("You must pay the credit card balance immediately");
            }

            else {
                System.out.println("Balance on your credit card is not over 1000, so you can spend more money.");
            }


        }

        else {
            System.out.println("Would you like to receive a credit card?");
        }
    }
}

package class4;

import java.util.Scanner;

public class loanSpecialist {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int loanAmount;

        System.out.println("Greetings: I am a loan Specialist.");
        System.out.println("What is the loan amount you are requesting?");
        loanAmount = scanner.nextInt();

        if (loanAmount <= 200000) {

            System.out.println("I can lend you that amount of money");
        }

        else {
            System.out.print("Your requested loan amount has been denied ");
            System.out.println("Client is rejected");
        }
    }
}

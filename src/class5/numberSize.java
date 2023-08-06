package class5;

import java.util.Scanner;

public class numberSize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numVal;

        System.out.println("Please enter a number ranging from 1 to 1000:");
        numVal = scanner.nextInt();

        if ( (numVal >= 1) && (numVal <= 10) ) {
            System.out.println("Number is small");
        }
        else if ( (numVal >= 11) && (numVal <= 100) ) {
            System.out.println("Number is Medium");
        }
        else if ( (numVal >= 101) && (numVal <= 1000) ) {
            System.out.println("Number is Large");
        }
        else {
            System.out.println("Invalid number");
        }

    }
}

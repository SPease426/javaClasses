package class4;

import java.util.Scanner;

public class licensedDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello I am a DMV Representative");
        System.out.println("May I know your age?");
        int age = scanner.nextInt();

        if (age >= 18) {
            System.out.println("Please wait your Driver's license will be ready shortly");
        }

        else {
            System.out.print("Your too young for a Driver's license, would you be interested ");
            System.out.println("in a driver's license instead?");
        }

    }
}

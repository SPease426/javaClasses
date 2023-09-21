package class12;

import java.util.Scanner;

public class HWT1 {

    int isPrime(int num) {

        if (num > 1) {
            if (num == 2 || num == 3) { // 2 is always prime
                System.out.println(num + " is a prime number");
            }

            else if (num % 2 == 1 && (num % 3 != 0)) { // if number is not a multiple of 3
                System.out.println(num + " is a prime number");
            }

            else {
                System.out.println(num + " is not a prime number");
            }
        }
        else {
            System.out.println(num + " is not a prime number");
        }
        return num;
    }

    public static void main(String[] args) {

        HWT1 prime = new HWT1();

        System.out.println("Enter a number and use the isPrime() method to determine if number is prime");
        prime.isPrime(4);

    }
}

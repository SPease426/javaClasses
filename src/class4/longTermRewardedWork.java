package class4;

import java.util.Scanner;

public class longTermRewardedWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numYears;
        int annualSalary;

        System.out.println("How many years did you work?");
        numYears = scanner.nextInt();

        if (numYears >= 5) {
            System.out.println("Congrats you are eligible for the bonus");
            System.out.println("What is your annual Salary?");
            annualSalary = scanner.nextInt();

            if (annualSalary > 50000) {
                System.out.println("$5000 dollar bonus");
            }
            else {
                System.out.println("$3000 dollar bonus");
            }
        }
        else {
            System.out.println("Sorry you are not yet eligible for the bonus");
        }
    }
}

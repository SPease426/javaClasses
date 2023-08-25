package review3;

import java.util.Scanner;

public class T1LogicalOperators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean youHungry;
        boolean youSleepy;

        System.out.println("Are you hungryy?");
        youHungry = scanner.nextBoolean();

        System.out.println("Are you sleepy");
        youSleepy = scanner.nextBoolean();

        if (!youHungry && youSleepy) {
            System.out.println("You need coffee");
        }

        else if (!youHungry && youSleepy) {
            System.out.println("You need sleep");
        }
    }
}

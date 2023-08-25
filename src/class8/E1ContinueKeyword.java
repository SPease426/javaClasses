package class8;

import java.util.Scanner;

public class E1ContinueKeyword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
            System.out.println("Batch 27 is Greatest of all time");

            System.out.println("Enter -1 if you wish to skip");
            int input = scanner.nextInt();

            if (input == -1) {
                continue;
            }

            else {
                System.out.println("Just Kidding");
            }

        }
    }
}

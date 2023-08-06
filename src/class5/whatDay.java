package class5;

import java.util.Scanner;

public class whatDay {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int dayOfWeek;


        System.out.println("Please enter a number associated with that day Acceptable Input is 1 through 7");
        dayOfWeek = scanner.nextInt();

        if ( !(dayOfWeek == 6) || !(dayOfWeek == 7) ) {
            System.out.println("It is a weekday");
        }
        else if ( (dayOfWeek == 6) || (dayOfWeek == 7) ) {
            System.out.println("It is a weekend");
        }
        else {
            System.out.println("Invalid day");
        }
    }
}

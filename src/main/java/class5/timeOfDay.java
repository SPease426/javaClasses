package class5;

import java.util.Scanner;

public class timeOfDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dayHour;

        System.out.println("Please enter the hour of the day in Military time 1 to 24");
        dayHour = scanner.nextInt();

        if ( (dayHour >= 1) && (dayHour <= 11) ) {
            System.out.println("It is Morning");
        }
        else if ( (dayHour >= 12) && (dayHour <= 15) ) {
            System.out.println("It is Noon");
        }
        else if ( (dayHour >= 16) && (dayHour <= 20) ) {
            System.out.println("It is Evening");
        }
        else if ( (dayHour >= 21) && (dayHour <= 24) ) {
            System.out.println("It is Night");
        }
    }
}

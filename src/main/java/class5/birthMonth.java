package class5;

import java.util.Scanner;

public class birthMonth {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your birth month abbreviation: Jan Feb Mar Apr May ");
        System.out.println("Jun Jul Aug Sept Oct Nov Dec");
        String month = scanner.next();

        if ( (month.equals("Mar")) || (month.equals("Apr")) || (month.equals("May")) ) {
            System.out.println("The season is Spring");
        }
        else if ( (month.equals("Jun")) || (month.equals("Jul")) || (month.equals("Aug")) ) {
            System.out.println("The season is Summer");
        }
        else if ( (month.equals("Sept")) || (month.equals("Oct")) || (month.equals("Nov")) ) {
            System.out.println("The season is Fall");
        }
        else if ( (month.equals("Dec")) || (month.equals("Jan")) || (month.equals("Feb")) ) {
            System.out.println("Tje season is Winter");
        }
    }
}

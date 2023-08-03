package class3;

public class HW1MonthNumber {

    public static void main(String[] args) {

        int dayMonth = 30;

        if ((dayMonth % 12) + 1 == 1 ) {

            System.out.println("Its Janurary");
        }
        else if ((dayMonth % 12) + 1 == 2) {
            System.out.println("Its Feburary");
        }
        else if ((dayMonth % 12) + 1 == 3) {
            System.out.println("Its March");
        }
        else if ((dayMonth % 12) + 1 == 4) {
            System.out.println("Its April");
        }
        else if ((dayMonth % 12) + 1 == 5) {
            System.out.println("Its May");
        }
        else if ((dayMonth % 12) + 1 == 6) {
            System.out.println("Its June");
        }
        else if ((dayMonth % 12) + 1 == 7) {
            System.out.println("Its July");
        }
        else if ((dayMonth % 12) + 1 == 8) {
            System.out.println("Its August");
        }
        else if ((dayMonth % 12) + 1 == 9) {
            System.out.println("Its September");
        }
        else if ((dayMonth % 12) + 1 == 10) {
            System.out.println("Its October");
        }
        else if ((dayMonth % 12) + 1 == 11) {
            System.out.println("Its November");
        }
        else if ((dayMonth % 12) + 1 == 12) {
            System.out.println("Its December");
        }
        else {
            System.out.println("Not a month");
        }

    }
}

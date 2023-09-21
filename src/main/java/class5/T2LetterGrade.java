package class5;

import java.util.Scanner;

public class T2LetterGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int letterGrade;

        System.out.println("Please say what grade did you get in capital letters only");
        letterGrade = scanner.next().charAt(0);

        switch (letterGrade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }

    }
}

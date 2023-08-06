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
                System.out.println("Excellent work");
                break;
            case 'B':
                System.out.println("Good work overall");
                break;
            case 'C':
                System.out.println("Average job but still room for improvement");
                break;
            case 'D':
                System.out.println("This is a bad grade you need to do study more");
                break;
            default:
                System.out.println("This is unacceptable and is considered to be a failure");
        }

    }
}

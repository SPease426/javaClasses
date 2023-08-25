package class6;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int gradeMark;
        char letterGrade = 0;

        System.out.println("Please enter your mark");
        gradeMark = scanner.nextInt();

        if ( (gradeMark >= 1) && (gradeMark < 25) ) {
            letterGrade = 'F';
        }
        else if ( (gradeMark >= 25) && (gradeMark < 45) ) {
            letterGrade = 'E';
        }
        else if ( (gradeMark >= 45) && (gradeMark < 50) ) {
            letterGrade = 'D';
        }
        else if ( (gradeMark >= 50) && (gradeMark < 60) ) {
            letterGrade = 'C';
        }
        else if ( (gradeMark >= 60) && (gradeMark < 80)) {
            letterGrade = 'B';
        }
        else if (gradeMark >= 80) {
            letterGrade = 'A';
        }

        System.out.print("Your grade is " + letterGrade);


    }

}

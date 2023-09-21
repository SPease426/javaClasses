package class5;

import java.util.Scanner;

public class stringGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double quizScore;
        double midTerm;
        double finalExam;
        double totalScore;
        double averageScore;

        System.out.println("Please state the three graded scores from your quiz, midterm and final exam");
        quizScore = scanner.nextInt(); // quizzes usually out of 20
        midTerm = scanner.nextInt(); // midterms and Final Exams are usually out of 100 points so
        finalExam = scanner.nextInt();

        totalScore = 220; // total of points from quiz + midterm and Final

        averageScore = (quizScore + midTerm + finalExam) / totalScore;
        averageScore *= 100; // multiply by 100 to move the decimal two points to the right to simulate grade percentage

        if (averageScore >= 90) {
            System.out.println("Excellent work you got an A for scoring over 90 or more");
        }
        else if ( (averageScore >= 70) && (averageScore < 90) ) {
            System.out.println("Overall good job your grade is a B for scoring between 70 and 90");
        }
        else if ( (averageScore >= 50) && (averageScore < 70) ) {
            System.out.println("Average job your grade is a C for soring between 50-70");
        }
        else {
            System.out.println("Not acceptable this is a failure and your grade is an F");
        }


    }
}

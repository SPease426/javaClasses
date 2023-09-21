package review3;

import java.util.Scanner;

public class UsingVoid {
    void getGrade(int score) {
        String gradeLetter;

        if (score >= 90) {
            gradeLetter = ("My letter grade is an A");
        }
        else if (score >= 80) {
            gradeLetter = ("My letter grade is a B");
        }
        else if (score >= 70) {
            gradeLetter = ("My letter grade is a C");
        }
        else if (score >= 50) {
            gradeLetter = ("My letter grade is a D");
        }
        else {
            gradeLetter = ("My letter grade is a F");
        }

        System.out.println(gradeLetter);


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        UsingVoid getGradeObj = new UsingVoid();

        System.out.println("Enter your score");
        int num = scanner.nextInt();
        getGradeObj.getGrade(num);

    }
}

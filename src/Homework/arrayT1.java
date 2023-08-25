package Homework;

import java.util.Scanner;

public class arrayT1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char schoolGrade[] = {'A','B','C','D'};

        System.out.println(schoolGrade[1]);

        System.out.println("Enter size of Array");
        int y = scanner.nextInt();
        char gradeList[] = new char[y];

        for (int i = 0; i < y ; i++) {
            System.out.println("Enter a grade letter");
            gradeList[i] = scanner.next().charAt(0);

        }

        System.out.println(gradeList[1]);
    }
}

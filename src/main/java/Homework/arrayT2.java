package Homework;

import java.util.Scanner;

public class arrayT2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String names[] = {"Kathryn", "Rakhima", "Shawn", "Tahmin", "Ali", "Michelle"};

        for (int i = 0; i < names.length ; i++) {
            if (names[i].equals("Shawn")) {
                System.out.println(names[i]);
            }

        }
        System.out.println("Enter the number of students in your group");
        int myGroup = scanner.nextInt();

        String groupNames[] = new String[myGroup];

        for (int i = 0; i < groupNames.length; i++) {

            System.out.println("Enter your name");
            groupNames[i] = scanner.next();
        }

        for (int i = 0; i < groupNames.length; i++) {
            // if my name is listed in the group print it along with member number (element)
            if (groupNames[i].equals("Shawn")) {
                System.out.println("My name is " + groupNames[i] + " and I am member number " + (i + 1));
            }

        }
    }
}

package class4;

import java.util.Scanner;

public class E4Scanner {
    public static void main(String[] args) {

        System.out.println("Please Enter your name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        char gender = scanner.next().charAt(0);

        System.out.println("Hello " + name);

        if (name.equals("Shawn")) {
            System.out.println("Java Student");
        }

        else {
            System.out.println("I don't know you...");
        }

        System.out.println("Your age: " + age);
        System.out.println(gender);


    }
}

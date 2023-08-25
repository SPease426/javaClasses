package class10;

import java.util.Scanner;

public class loginCredentials {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username");
        String userName = scanner.next();

        System.out.println("Enter password");
        String userPassword = scanner.next();

        if (userPassword.isEmpty() || userName.isEmpty()) {
            System.out.println("Username or password cannot be empty");

            System.out.println("Enter username");
            userName = scanner.next();

            System.out.println("Enter password");
            userPassword = scanner.next();
        }

        if (userPassword.length() < 8) {
            System.out.println("Password is too short");
        }
    }
}

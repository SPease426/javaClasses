package class12;
import java.util.Scanner;
public class Calculator {
    void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the first number");
        int num1 = scanner.nextInt();
        System.out.println("Please Enter the second number");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        System.out.println("sum of these numbers is " + sum);
    }
}

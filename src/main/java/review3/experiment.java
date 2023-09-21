package review3;
import java.util.Arrays;
import java.util.Scanner;

public class experiment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] numbers = {10,12,50,12,60,62,-13,62};

        numbers = Arrays.stream(numbers).sorted().toArray();

        System.out.println("Enter a number from 1 to " + numbers.length + " for the largest number");
        System.out.println("1 for largest, 2 for 2nd largest, 3 for 3rd largest, and so on");
        int val = scanner.nextInt();


        System.out.println("The second largest number is " + numbers[numbers.length - val]);


    }
}

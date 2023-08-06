package class5;

import java.util.Scanner;

public class personHeight {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int height;

        System.out.println("Please enter your height");
        height = scanner.nextInt();

        if (height < 60) {
            System.out.println("Short");
        }
        else if ( (height >= 60) && (height <= 72) ) {
            System.out.println("Medium");
        }
        else if ( (height > 72) ) {
            System.out.println("Tall");
        }

    }
}

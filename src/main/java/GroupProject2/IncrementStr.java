package GroupProject2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IncrementStr {

    public long Increment(String inp) {
        long num;

        num = Long.parseLong(inp);

        return num + 1;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IncrementStr obj = new IncrementStr();

        System.out.println("Please enter a number");
        String chosenNum = scanner.next();

        System.out.println(chosenNum + " and then it increments to " + obj.Increment(chosenNum));


    }
}

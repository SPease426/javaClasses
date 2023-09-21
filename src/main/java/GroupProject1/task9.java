package GroupProject1;

import java.util.Arrays;

public class task9 {

    public static void main(String[] args) {

        int [] numbers = {10,12,50,12,60,62,-13,61};


        int largestNum = Arrays.stream(numbers).max().getAsInt();
        int secondLarge = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] < largestNum && numbers[i] > secondLarge) {
                secondLarge = numbers[i];

            }
        }

        System.out.println(secondLarge + " is the second largest number");
        
    }
}

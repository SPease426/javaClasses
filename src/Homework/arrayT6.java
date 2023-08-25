package Homework;

public class arrayT6 {
    public static void main(String[] args) {
        int sumTotal = 0;
        int maxNum = 0;

        int numSet[] = {10, 20, 50, 200, 120};

        for (int i = 0; i < numSet.length; i++) {

            sumTotal = sumTotal + numSet[i];

        }
        System.out.println(sumTotal + " is the sum of all the integers in the array");

        for (int i = 0; i < numSet.length; i++) {
            if (numSet[i] > maxNum) {
                maxNum = numSet[i];
            }
        }
        System.out.println(maxNum + " is the maximum number or the greatest positive number in the array");
    }
}

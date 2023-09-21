package class7;

public class challengeT4 {

    public static void main(String[] args) {
        int sumTotal = 0;

        int[] numbers = {20,10,50,30,40};

        for (int i = 1; i <= numbers.length ; i++) {

            sumTotal = sumTotal + numbers[i];

        }

        System.out.println(sumTotal);
    }
}

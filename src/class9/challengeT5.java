package class9;

public class challengeT5 {
    public static void main(String[] args) {
        int totalCash = 0;
        int[][] money = {

                {200, 100, 50},
                {400, 200, 50},
                {1000, 1000, 1000}
        };

        for (int i = 0; i < money.length; ++i) {
            for (int j = 0; j < money[i].length; ++j) {
                totalCash = totalCash + money[i][j];
            }
        }

        System.out.println("The total amount of cash is $" + totalCash); // $4000 dollars
    }
}

package class9;

public class challengeT4 {
    public static void main(String[] args) {

        String[][] groceries = {

                {"Asparagus","Carrots","Broccoli"},
                {"Apples","BlackBerries","Strawberries", "Bananas","Green Grapes"},
                {"Milk","Eggs","Butter"},
                {"Skittles","Apple Turnover", "Cake"}
        };

        for(int i = 0; i < groceries.length; ++i) {
            for (int j = 0; j < groceries[i].length;++j) {

                System.out.print(groceries[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Using an enhanced for loop

        for (String[] currentCategory: groceries) {
            for (String currItem: currentCategory) {
                System.out.print(currItem + " ");
            }
            System.out.println();
        }

    }
}

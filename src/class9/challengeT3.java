package class9;

public class challengeT3 {
    public static void main(String[] args) {
        String[][] cars = {

                {"Buick","Mercades","Chevorlet"},
                {"The Titans","Sleepers","And Has-Beens"},
                {"Subaru","Nissan","Hundai"},
                {"Ferrari","Lamborghini","Pagani"}
        };

        for(int i = 0; i < cars.length; ++i) {

            for(int j = 0; j < cars[i].length; ++j) {
                System.out.print(cars[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Using an enhanced for loop
        for (String[] car: cars) {
            for(String single: car) {
                System.out.print(single + " ");
            }
            System.out.println();
        }

    }
}

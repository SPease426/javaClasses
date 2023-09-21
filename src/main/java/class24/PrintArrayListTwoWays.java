package class24;

import java.util.ArrayList;

public class PrintArrayListTwoWays {

    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();

        cars.add("Toyota Prius");
        cars.add("Toyota Corolla");
        cars.add("Mazda");
        cars.add("Lexus");
        cars.add("Honda");

        System.out.println(cars);

        System.out.println();

        for (int i = 0; i < cars.size(); ++i) {
            System.out.println(cars.get(i));
        }
    }
}

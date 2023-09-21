package class24;

import java.util.ArrayList;

public class replaceWord {

    public static void main(String[] args) {
        ArrayList<String> drinks = new ArrayList<>();

        drinks.add("Lipton Iced Tea");
        drinks.add("Pepsi");
        drinks.add("Milk");
        drinks.add("Smoothie");
        drinks.add("Margarita");

        System.out.println(drinks);

        for (int i = 0; i < drinks.size(); ++i) {
            if(drinks.get(i).contains("a") || (drinks.get(i).contains("e"))) {
                drinks.set(i, "water");
            }
        }

        System.out.println(drinks);
    }
}

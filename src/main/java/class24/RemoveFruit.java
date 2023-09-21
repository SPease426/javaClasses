package class24;

import org.checkerframework.checker.units.qual.A;

import java.util.ArrayList;

public class RemoveFruit {

    public static void main(String[] args) {
        ArrayList<String> fruit = new ArrayList<>();

        fruit.add("Apple");
        fruit.add("Plum");
        fruit.add("Blueberries");
        fruit.add("Banana");
        fruit.add("Carrots");

        System.out.println(fruit);

        fruit.removeIf(x->x.contains("a") || x.contains("e"));

        System.out.println(fruit);
    }
}

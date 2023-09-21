package class24;

import java.util.ArrayList;
import java.util.EnumMap;

public class ArrayListTask {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        System.out.println("Is it empty " + names.isEmpty());

        names.add("Yuri Lowenthal");
        names.add("Tara Platt");
        names.add("Joe Flanigan");
        names.add("Shawn Pease");
        names.add("Sasuke Uchiha");

        System.out.println("Is it empty " + names.isEmpty());

        System.out.println(names.contains("Yuri Lowenthal"));
        System.out.println(names.size());
        System.out.println(names);

    }
}

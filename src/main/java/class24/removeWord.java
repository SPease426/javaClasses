package class24;

import java.util.ArrayList;

public class removeWord {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();

        words.add("milk");
        words.add("banana");
        words.add("coffee");
        words.add("table");
        words.add("TV");

        System.out.println(words);

        for (int i = 0; i < words.size(); ++i) {

            if (words.get(i).endsWith("e")) {
                words.remove(i);
                --i;
            }
        }
        System.out.println("**************************************************");

        System.out.println(words);
    }
}

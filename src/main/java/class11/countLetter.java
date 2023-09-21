package class11;

public class countLetter {
    public static void main(String[] args) {

        int count = 0;
        String str = "Batch 17 is great.";

        for (int i = 0; i < str.length(); ++i) {

            if (str.charAt(i) == 'a') {
                count++;
            }
        }

        System.out.println(count + " is the number of times the letter a appears in the string");
    }
}

package class14;

public class VowelLetters {

    private String getVowels(String str) {
        str = str.replaceAll("[^AEIOUaeiou]", "");
        return str;
    }

    public static void main(String[] args) {
        VowelLetters newStr = new VowelLetters();
        System.out.println(newStr.getVowels("THAIDAWDefeiiief"));
    }
}

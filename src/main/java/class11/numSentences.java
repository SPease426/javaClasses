package class11;

public class numSentences {
    public static void main(String[] args) {

        String a = "Is it saturday? Is it raining? Do we have a Java Class today?";
        String [] strs = a.split("[?]");

        System.out.println(strs.length + " is the number of sentences in the string a");
    }
}

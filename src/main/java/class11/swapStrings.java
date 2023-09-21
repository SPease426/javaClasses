package class11;

public class swapStrings {
    public static void main(String[] args) {
        String firstName = "Shawn";
        String lastName = "Pease";

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println();

        firstName = firstName + lastName; // Swap strings
        lastName= firstName.substring(0, firstName.length() - lastName.length());
        firstName = firstName.substring(lastName.length());



        System.out.println("String variables are swapped");
        System.out.println(firstName);
        System.out.println(lastName);
    }
}

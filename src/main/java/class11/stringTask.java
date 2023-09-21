package class11;

public class stringTask {
    public static void main(String[] args) {
        String currency = "US Dollar"; // 9 characters

        if (!currency.isEmpty()) {

            if (currency.length() % 2 == 1 && currency.length() >= 3) {
                System.out.print(currency.charAt(currency.length() / 2));
            }

            else {
                System.out.println("String does not have 3 or more characters or the number of characters is not odd");
            }

        }
    }
}

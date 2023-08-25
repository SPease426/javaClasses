package class9;

public class challengeT7 {
    public static void main(String[] args) {
        String[][] allCountries = {

                {"USA","Mexico","Canada", "Cuba", "Jamaica"}, // North American Countries
                {"Brazil","Peru","Colombia","Bolivia","Chile"}, // South American Countries
                {"United Kingdom","Austria","Iceland","Spain", "France"}, // European Countries
                {"Japan","China","Indonesia","Vietnam", "Mongolia"}, // Asian Countries
                {"Egypt", "Morocco","Kenya","Madagascar","Zambia"} // African Countries
        };

        int sumCountries = 0;
        for (String[] continent: allCountries) {
            for (String country: continent) {

                System.out.print(country + " ");
                sumCountries++;
            }
            System.out.println();
        }
        System.out.println("The number of countries listed is " + sumCountries + "\n");

        int total = 0;
        for (int i = 0; i < allCountries.length; ++i) {

            for (int j = 0; j < allCountries[i].length; ++j) {
                System.out.print(allCountries[i][j] + " ");
            }
            total = total + allCountries[i].length;
            System.out.println();
        }
        System.out.println("The total number of countries listed is " + total);

    }
}

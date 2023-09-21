package class4;

public class searchingHome {
    public static void main(String[] args) {

        double mortgageRate = 3.0;
        int mortgagePrice = 60000;

        if (mortgageRate > 4.5) {
            System.out.println("Not interested in buying this house");

        }

        else {
            System.out.println("I'm considering buying this house");
            if (mortgagePrice > 50000) {
                System.out.println(mortgagePrice + " is a little high I'll need to take a loan");
            }

            else {
                System.out.println(mortgagePrice + " is a low enough price I'll pay in cash");
            }
        }
    }
}

package class19;

import org.checkerframework.checker.units.qual.A;

public class CreditCardTester {
    public static void main(String[] args) {

        CreditCard card = new CreditCard();
        card.callInterest(100);
        Visa vCard = new Visa();
        vCard.callInterest(100);
        AX axCard = new AX();
        axCard.callInterest(100);
    }
}

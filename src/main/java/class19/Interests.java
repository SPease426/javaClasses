package class19;

public class Interests {

    static void Interests() {
        System.out.println("I love my life");
    }

    static void Interests (String inp) {
        System.out.println("I love earning " + inp);
    }

    static void Interests (String inp, String fun) {
        System.out.println("I love " + fun + " and earning money for the games I play");
    }

    public static void main(String[] args) {
        Interests();
        Interests("money");
        Interests("money", "playing games");
    }
}

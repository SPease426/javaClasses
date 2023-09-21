package class19;

public class Programming {
    Programming() {
        System.out.println("I love programming languages");
    }

    Programming(String inp) {
        System.out.println("I love " + inp);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("Java");
    }
}

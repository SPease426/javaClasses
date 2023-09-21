package class16;

public class Laptop {

    private Laptop() {
        System.out.println("Private");
    }
    Laptop (String name) {
        System.out.println("Default");
    }
    protected Laptop (double price) {
        System.out.println("Protected");
    }
    public Laptop(int price) {
        System.out.println("Public");
    }

    public static void main(String[] args) {
        new Laptop();
        new Laptop("ASUS");
        new Laptop(7999.99);
        new Laptop(5000);
    }
}

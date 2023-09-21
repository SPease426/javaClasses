package class17;

public class BirdTester {

    public static void main(String[] args) {

        Sparrow sparrow = new Sparrow("Chuntaro", "Sparrow", "Dark and light Brown colors", 3, "small");
        Parrot parrot = new Parrot("Paulie", "Parrot", "Red and Green", 2, true);

        sparrow.printInfo();
        parrot.printInfo();
    }
}

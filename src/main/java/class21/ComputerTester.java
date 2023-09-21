package class21;

public class ComputerTester {

    public static void main(String[] args) {

        Computer[] product = {new Apple(), new Dell("AlienWare"), new Dell(), new HP(), new Lenovo()};
        for(Computer device: product) {
            device.printInfo();
            device.playGames();
            device.haveGraphics();
            System.out.println();
        }
    }
}

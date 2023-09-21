package class17;

public class animalTester {
    public static void main(String[] args) {
        Cat c = new Cat();
        Dog d = new Dog();

        c.name = "Tom";
        c.breed = "Russian";
        c.age = 25;
        c.color = "gray";
        c.attitude = true;
        c.printInfo();
        d.name = "Steve";
        d.breed = "Poodle";
        d.color = "brown";
        d.age = 3;
        d.printInfo();

    }
}

package class15;

public class Dog {
    String name;
    String breed;
    String color;
    int age;

    public Dog(String dName, String dBreed, String dColor, int dAge) { // Constructor I think video told me about this
        name = dName;
        breed = dBreed;
        color = dColor;
        age = dAge;
    }

    void bark() {
        System.out.println("wuff wuff...");
    }

    void printInfo() {
        System.out.println(name + " " + breed + " " + color);
    }


}

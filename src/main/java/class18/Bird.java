package class18;

public class Bird {
    private String name;
    private String breed;
    private String color;
    private int age;
    Bird(String name, String breed, String color, int age) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.age = age;
    }
    public void printInfo() {
        System.out.print(name + " " + breed + " " + color + " " + age + " ");
    }
}
class Sparrow extends Bird {
    private String size;

    Sparrow(String name, String breed, String color, int age, String size) {
        super(name, breed, color, age);
        this.size = size;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(size);
    }
}
class Parrot extends Bird {
    private boolean canTalk;

    Parrot(String name, String breed, String color, int age, boolean canTalk) {
        super(name, breed, color, age);
        this.canTalk = canTalk;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println(canTalk);
    }
}

package class16;

public class Cat {
    private String name;
    private String breed;
    private int age;
    private int weight;
    private String color;
    private String personality;



    public Cat(String name, String breed, int age, int weight, String color, String personality) {
        this.name = name;
        this.breed = breed;
        this.age = age;
        this.weight = weight;
        this.color = color;
        this.personality = personality;

        System.out.println(name + " " + breed + " " + age + " " + weight + " " + color + " " + personality);
    }

    public Cat(String name, String breed, String color, String personality) {
        this.name = name;
        this.breed = breed;
        this.color = color;
        this.personality = personality;

        System.out.println(name + " " + breed + " " + color + " " + personality);
    }

    public Cat(String name, String breed, String personality) {
        this.name = name;
        this.breed = breed;
        this.personality = personality;

        System.out.println(name + " " + breed + " " + personality);
    }



    public static void main(String[] args) {

        Cat misty = new Cat("Misty", "Calico", 13, 80, "Grey", "Loving");
        Cat kiki = new Cat("Kiki", "Calico", 4, 50, "Tortoise", "Aggressive");
        Cat nagi = new Cat("Nagi", "Norwegian Forest Cat", "Sweet");
    }

}

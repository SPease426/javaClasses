package class10;

public class Dog {
    String name;
    String color;
    int weight;


    void bark() {
        System.out.println(this.name + " can bark");
    }

    void run() {
        System.out.println(this.name + " can run");
    }

    void play() {
        System.out.println(this.name + " can play");
    }


    public static void main(String[] args) {

        Dog huskyObj = new Dog();
        huskyObj.name = "Husky";
        huskyObj.color = "White";
        huskyObj.weight = 35;

        Dog bulldogObj = new Dog();
        bulldogObj.name = "Bulldog";
        bulldogObj.color = "Black";
        bulldogObj.weight = 30;

        Dog labradorObj = new Dog();
        labradorObj.name = "Labrador";
        labradorObj.color = "Brown";
        labradorObj.weight = 25;

        huskyObj.bark();
        huskyObj.run();
        huskyObj.play();

        bulldogObj.bark();
        bulldogObj.run();
        bulldogObj.play();

        labradorObj.bark();
        labradorObj.run();
        labradorObj.play();

    }
}

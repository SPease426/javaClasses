package class10;

public class Car {

    String model;
    String color;
    String horsepower;

    void maxSpeed() {
        System.out.println("This " + model + " has " + horsepower);
    }

    void paintJob() {
        if (color.equalsIgnoreCase("Yellow")) {
            System.out.println("Change the yellow car to a Metallic Crimson Red car");
            color = "Crimson Red";
        }

        else {
            System.out.println("Car has a good color no need for a paint job");
        }
    }

    void clean() {
        System.out.println("Car is now cleaned and waxed");
    }
    public static void main(String[] args) {

        Car sedanObj = new Car();
        sedanObj.model = "Sedan";
        sedanObj.color = "Yellow";
        sedanObj.horsepower = "160 horsepower";
        sedanObj.maxSpeed();
        sedanObj.paintJob();
        sedanObj.clean();

        System.out.println();

        Car SUVObj = new Car();
        SUVObj.model = "SUV";
        SUVObj.color = "Blue";
        SUVObj.horsepower = "180 horsepower";
        SUVObj.maxSpeed();
        SUVObj.paintJob();
        SUVObj.clean();

        System.out.println();

        Car sportCarOBj = new Car();
        sportCarOBj.model = "Lamborghini";
        sportCarOBj.color = "Red";
        sportCarOBj.horsepower = "1,300 horsepower";
        sportCarOBj.maxSpeed();
        sportCarOBj.paintJob();


    }
}

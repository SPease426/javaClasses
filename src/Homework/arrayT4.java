package Homework;

public class arrayT4 {
    public static void main(String[] args) {
        String cars[] = {"Lexus E3","Ford Mustang","Toyota Corolla","Chevrolet Camaro","Mazda Mazda6","Chevrolet Corvette"};
        int i;

        // using the for loop to output array
        System.out.println("List of cars I own:");
        for (i = 0; i < cars.length; i++) {

            System.out.println(cars[i]);
        }
        System.out.println();

        // Using the do while loop
        i = 0;
        do {
            System.out.println(cars[i]);
            ++i;
        } while (i != cars.length);
    }
}

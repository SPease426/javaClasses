package Homework;

public class arrayT5 {
    public static void main(String[] args) {
        String animalList[] = {"Calico Cat","German Sheppard","Raven","Bob Cat","Parrot"};

        System.out.println("\nUsing a for loop\n");

        System.out.println("List of animals:");
        for (int i = 0; i < animalList.length ; i++) {
            System.out.println(animalList[i]);
        }

        System.out.println("\nUsing a while loop\n");

        // Using a while loop
        int i = 0;
        while (i != animalList.length) {
            System.out.println(animalList[i]);
            ++i;
        }
    }
}

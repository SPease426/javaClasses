package class10;

import java.util.Scanner;

public class Phone {
    Scanner scanner = new Scanner(System.in);
    String modelName;
    int yearMake;
    String color;

    void identify() {
        System.out.print("The phone is a " + this.color + " " + this.modelName);
        System.out.println(" made in the year " + this.yearMake);
    }

    void call() {
        System.out.println("Enter phone number you wish to call");
        String phoneNum = scanner.nextLine();

        System.out.println("Calling phone number " + phoneNum);
    }

    void charge() {

        System.out.println("Is the phone currently charging? Enter true or false");
        boolean isCharging = scanner.nextBoolean();

        if (isCharging) {
            System.out.println("Phone is currently charging");
        }

        else {
            System.out.println("Error not correctly plugged in");
        }

    }

    void setContact() {
        System.out.println("Please enter contact's name followed by their number");
        String contactName = scanner.nextLine();
        String phoneNum = scanner.nextLine(); // In case of Area code (661) or a -

        System.out.println("Contact's name is " + contactName + " and the phone number is " + phoneNum);
    }

    public static void main(String[] args) {
        Phone IPhoneObj = new Phone();
        IPhoneObj.modelName = "IPhone";
        IPhoneObj.color = "White";
        IPhoneObj.yearMake = 2018;

        IPhoneObj.identify();
        IPhoneObj.call();
        IPhoneObj.setContact();
        IPhoneObj.charge();

        System.out.println("\n" + "===================================" + "\n");

        Phone PixelObj = new Phone();
        PixelObj.modelName = "Pixel";
        PixelObj.color = "Black";
        PixelObj.yearMake = 2010;

        PixelObj.identify();
        PixelObj.call();
        PixelObj.setContact();
        PixelObj.charge();

        System.out.println("\n" + "===================================" + "\n");

        Phone SamsungObj = new Phone();
        SamsungObj.modelName = "Samsung";
        SamsungObj.color = "Navy Blue";
        SamsungObj.yearMake = 2022;

        SamsungObj.identify();
        SamsungObj.call();
        SamsungObj.setContact();
        SamsungObj.charge();
    }

}

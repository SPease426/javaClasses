package class2;

public class Variables {

    public static void main(String[] args) {

        String firstName = "Felicia";
        String lastName = "Lopez";
        String city = "Los Angeles";
        String state = "California";
        String phoneNum = "(661) 820-4325";
        char grade = 'B';

        System.out.println("My First name is " + firstName + " and my last name is " + lastName);
        System.out.println("I live in the city of " + city + " in the state of " + state);
        System.out.println("My phone number is " + phoneNum);
        System.out.println("My grade is " + grade);
        System.out.println("\n");

        lastName = "Iglesias"; // Got Married
        city = "Reno";
        state = "Nevada";
        phoneNum = "(661) 859-6489";

        System.out.print("My name is " + firstName + " " + lastName + " and I moved to new city " + city);
        System.out.print(" and new state " + state + ".\n");
        System.out.println("My new phone number is " + phoneNum);

    }
}

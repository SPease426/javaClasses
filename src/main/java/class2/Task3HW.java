package class2;

public class Task3HW {

    public static void main(String[] args) {

        double numPlums=2.0;
        double numApples=5.0;
        double totalFruit;
        double subtractValue;
        double multipliedValue;
        double dividedValue;
        double dividedRemainder;

        System.out.print("Addition of 2 numbers "+numPlums+ " and " + numApples+ " is ");
        System.out.println(totalFruit= numPlums + numApples);

        System.out.print("Subtraction of 2 numbers is " + numPlums + " and " + numApples + " is ");
        System.out.println(subtractValue= numPlums - numApples);

        System.out.print("Multiplication of 2 numbers is "+  numApples + " and " + numPlums + " is ");
        multipliedValue= numApples*numPlums;
        System.out.println(multipliedValue);

        System.out.print("Division of 2 numbers is " + numApples + " and " + numPlums + " is ");
        System.out.println(dividedValue= numApples/numPlums);

        System.out.print("Remainder of the division calcuated above has a remainder of ");
        System.out.println(dividedRemainder= numApples%numPlums);
    }
}

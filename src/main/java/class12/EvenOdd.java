package class12;

public class EvenOdd {

    public String EvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        }
        else if (num % 2 == 1 || num % 2 == -1) {
            return "Odd";
        }
        else {
            return"not a valid number";
        }
    }

    public static void main(String[] args) {
        EvenOdd evenOddObj = new EvenOdd();
        System.out.println("5 is " + evenOddObj.EvenOrOdd(5));
        System.out.println("6 is " + evenOddObj.EvenOrOdd(6));
    }
}

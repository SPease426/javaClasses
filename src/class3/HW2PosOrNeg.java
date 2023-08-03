package class3;

public class HW2PosOrNeg {

    public static void main(String[] args) {

        int numVal = 0;

        if (numVal > 0) {
            System.out.println(numVal + " is a positive number");
        }
        else if (numVal < 0) {
            System.out.println(numVal + " is a negagtive number");
        }
        else if (numVal == 0){
            System.out.println(numVal + " is zero and therefore the number is neither positive or negative");
        }
        else {
            System.out.println("Not a number");
        }
    }
}

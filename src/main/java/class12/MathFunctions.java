package class12;

public class MathFunctions {
    int multiply(int num) {
        int result = num * 10;
        return result;
    }

    public static void main(String[] args) {
        MathFunctions mathObj = new MathFunctions();
        System.out.println("5 times 10 equals " + mathObj.multiply(5));
    }
}

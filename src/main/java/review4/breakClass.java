package review4;

public class breakClass {
    public static void main(String[] args) {

        for (int i = 0; i < 4; i++) {

            System.out.println("Test");

            for(int j = 0; j < 4; ++j) {
                System.out.println("Win");
                break; // breaks through only one loop not all loops which I initially thought it did
            }

        }
    }
}

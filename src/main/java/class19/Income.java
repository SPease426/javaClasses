package class19;

public class Income {
    private static void print() {
        System.out.println("Earning $220 dollars a day" + "\n");
    }

    private static void print(int days) {
        if (days > 10) {
            System.out.println("If I work for more than 10 days than starting on the 11th day I get $235 a day");
            System.out.println("Or its $265 if I go to work for LAVA");
        }
    }

    public static void main(String[] args) {
        print();
        print(54);
    }


}

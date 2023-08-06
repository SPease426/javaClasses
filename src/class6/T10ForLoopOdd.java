package class6;

public class T10ForLoopOdd {
    public static void main(String[] args) { //print odd numbers from 100 to 1

        for (int i = 99; i >= 1; i-=2) {
            System.out.print(i + " ");

        }
        System.out.println("");

        int i = 99;

        do {
            System.out.print(i + " ");
            i-=2;
        } while (i >= 1);
    }
}

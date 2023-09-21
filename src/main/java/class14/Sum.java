package class14;

public class Sum {

    int sumArray (int[] arr) {
        int sum = 0;

        for (int n:arr) {
            sum = sum + n;
        }
        return sum;
    }

    public static void main(String[] args) {
        Sum t2 = new Sum();
        int[] arr = {5, 15, 50, 30};
        System.out.println(t2.sumArray(arr) + " is the sum of the array");
    }


}

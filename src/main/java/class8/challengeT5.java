package class8;

public class challengeT5 {
    public static void main(String[] args) {

        int[] nums = {10, 77, 25, 56, 60, 20, -10, -5};
        int lowestVal = nums[0];

        for (int n:nums) {

            if (n<lowestVal) {
                lowestVal = n;
            }


        }

        System.out.println(lowestVal);
    }
}

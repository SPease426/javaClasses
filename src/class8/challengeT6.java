package class8;

public class challengeT6 {
    public static void main(String[] args) {

        int[] nums = {10, 77, 25, 56, 60, 20, -10, -5};

        for (int i = 0; i < nums.length; ++i) {

            if (nums[i] < 0) {
                nums[i] = 0;

            }


        }

        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
    }
}

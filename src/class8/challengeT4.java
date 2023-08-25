package class8;

public class challengeT4 {
    public static void main(String[] args) {

        int[] nums = {10,77,25,56,60,20};
        int maxVal = nums[0];

        for (int n:nums) {

            if (n%2 == 0 && n > maxVal) {
                maxVal = n;
            }

        }
        System.out.println(maxVal);
    }
}

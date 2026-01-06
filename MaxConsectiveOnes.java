/*
 * Find the maximum number of consecutive 1's in an array of binary numbers.
 * Example:
 * Input: [1,1,1,1,0,1,1,1]
 * Output: 4
 */

public class MaxConsectiveOnes {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 1, 0, 1, 1, 1};
        int n = nums.length;
        int maxOnes = 0;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 1) {
                count += 1;

            } else {
                count = 0;
            }
            maxOnes = Math.max(maxOnes, count);
        }
        System.out.print("Max consecutive nums: " + maxOnes);
    }
}

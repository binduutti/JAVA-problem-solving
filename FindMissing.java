/*
 * Find the missing number in an array containing n distinct numbers
 * taken from 0, 1, 2, ..., n.
 * Example:
 * Input: [0,1,3]
 * Output: 2
 */
public class FindMissing {

    public static void main(String[] args) {
        int[] nums = {0, 1, 2};
        int n = nums.length;
        int miss = (n * (n + 1)) / 2;
        for (int i = 0; i < n; i++) {
            miss -= nums[i];
        }
        System.out.print("Missing: " + miss);
    }
}

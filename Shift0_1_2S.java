/* Given an array nums with n objects colored red, white, or blue,
 * the goal is to sort the array in-place so that objects of the same color are adjacent,
 * with the red objects (0) on the left, white objects (1) in the middle, and blue objects (2) on the right.
 */

public class Shift0_1_2S {

    public static void main(String[] args) {

        int[] nums = {2, 1, 0, 2, 0, 2, 1};
        int n = nums.length;
        int zerocount = 0;
        int onecount = 0;
        int twocount = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zerocount++;
            } else if (nums[i] == 1) {
                onecount++;
            } else {
                twocount++;
            }

        }
        int index = 0;
        for (int i = 0; i < zerocount; i++) {
            nums[index++] = 0;
        }

        for (int i = 0; i < onecount; i++) {
            nums[index++] = 1;
        }

        for (int i = 0; i < twocount; i++) {
            nums[index++] = 2;
        }

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

    }
}

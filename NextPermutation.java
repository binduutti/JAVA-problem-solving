/*
Implement next permutation, which rearranges numbers into the lexicographically next greater permutation of numbers.
If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
example:
Input: nums = [1,2,3]
Output: [1,3,2]
 */
class NextPermutation {

    public void nextPermutation(int[] nums) {
        int k = -1;
        int n = nums.length;
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                break;
            }
        }
        if (k == -1) {
            reverse(nums, 0, n - 1);
            return;
        }
        for (int i = n - 1; i > k; i--) {
            if (nums[i] > nums[k]) {
                int temp = nums[i];
                nums[i] = nums[k];
                nums[k] = temp;
                break;
            }
        }
        reverse(nums, k + 1, n - 1);

    }

    static void reverse(int[] nums, int start, int end) {
        for (int i = start; i < end; i++) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

// Problem: Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

class FindNumberThatAppearsOnce {

    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }

    public static void main(String[] args) {
        FindNumberThatAppearsOnce sol = new FindNumberThatAppearsOnce();
        int[] nums = {4, 1, 2, 1, 2};
        int result = sol.singleNumber(nums);
        System.out.println("The number that appears only once is: " + result);
    }
}

/*
Given an integer array nums, an element is called a "leader" if it is greater than or equal to all the elements to its right side. The rightmost element is always a leader. Return a list of all the leaders in the array.
example:
Input: nums = [-3,4,5,1,-4,-5]
Output: [5,1,-4,-5]
 */

import java.util.*;

public class LeadersinArray {

    public static boolean check(int ele, int eleindex, int[] nums) {
        int n = nums.length;
        for (int i = eleindex + 1; i < n; i++) {
            if (ele < nums[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] nums = {-3, 4, 5, 1, -4, -5};
        int n = nums.length;
        ArrayList<Integer> li = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            boolean isLeader = check(nums[i], i, nums);
            if (isLeader) {
                li.add(nums[i]);
            }
        }
        System.out.println(li);
    }
}

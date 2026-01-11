/*
Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times. You may assume that the array is non-empty and the majority element always exists in the array.
example:
Input: [3,2,3]
Output: 3
 */

import java.util.*;

class MajorityElement {

    public int majorityElement(int[] nums) {
        int n = nums.length / 2;
        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {
            if (entry.getValue() > n) {
                return entry.getKey();
            }
        }

        return -1;
    }
}

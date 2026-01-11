/*Find two numbers in an array that sum up to a specific target. 
e.g., if the input array is [2, 7, 11, 15] and the target is 9, the output should be (0, 1) because numbers[0] + numbers[1] == 9
 */
import java.util.*;

class Find2Sum {

    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            int need = target - nums[i];

            if (map.containsKey(need)) {
                return new int[]{map.get(need), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}

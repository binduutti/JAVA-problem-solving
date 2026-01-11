/* given an array of integers and an integer k, find the length of the longest subarray with sum k
example:
Input: arr = [1, -1, 5, -2, 3], k = 3
Output: 4
 */
import java.util.HashMap;

public class LongestSubarrWithKsum {

    public static int longestSubarrWithKsum(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        System.out.println("Length of longest subarray with sum " + k + " is: " + longestSubarrWithKsum(arr, k)); // Output: 4
    }
}

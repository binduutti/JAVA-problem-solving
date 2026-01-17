/* Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.
example: [100,4,200,1,3,2] => 4   */
public class LongestSubsequence {

    public static void main(String[] args) {
        int nums[] = {100, 4, 200, 1, 3, 2};
        int n = nums.length;
        int count = 1;
        int LongSeq = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        //1 2 4 5 6
        int ptr = nums[0];
        for (int i = 1; i < n; i++) {
            if (nums[i] == ptr) {
                continue;
            } else if (nums[i] == (ptr + 1)) {
                count++;
                ptr = nums[i];
                LongSeq = Math.max(LongSeq, count);
            } else {
                ptr = nums[i];
                count = 1;

            }
        }
        System.out.println(LongSeq);

    }
}

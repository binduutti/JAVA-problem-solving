/*Kadanes Algorithm to find the maximum sum subarray along with the subarray itself.
Input: An array of integers.
Output: The maximum sum of the contiguous subarray and the subarray itself.
Example:
Input: [-2,1,-3,4,-1,2,1,-5,4]
Output:  The contiguous subarray [4,-1,2,1] has the largest sum = 6.
 */

import java.util.Scanner;

class KadanesAlgorithmSubarr {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, k;
        System.out.println("enter number of numbers:");
        n = s.nextInt();
        int[] arr = new int[n];
        System.out.println("enter numbers for array:");
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int max = arr[0];
        int current = arr[0];
        int start = 0, end = 0, temp = 0;
        for (int i = 1; i < n; i++) {
            if (current + arr[i] > arr[i]) {
                current += arr[i];
            } else {
                current = arr[i];
                temp = i;
            }
            if (current > max) {
                max = current;
                start = temp;
                end = i;
            }
        }
        System.out.println(max);
        System.out.println("--");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

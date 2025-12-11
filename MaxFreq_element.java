/*
write a Java program to find the element with the highest frequency in an array.
example:
Input: [1, 2, 2, 3, 3, 3]
Output: 3
 */

import java.util.*;

class MaxFreq_element {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        HashMap<Integer, Integer> hm = new HashMap<>();

        for (int x : arr) {
            hm.put(x, hm.getOrDefault(x, 0) + 1);
        }

        int max = 0;
        int maxkey = 0;
        for (int key : hm.keySet()) {
            if (hm.get(key) > max) {
                max = hm.get(key);
                maxkey = key;
            }
        }

        System.out.println(maxkey);
    }
}

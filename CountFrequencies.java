/*
Write a Java program to count the frequency of each element in an array and store the result as a list of lists, where each sublist contains an element and its corresponding frequency.
Example:
Input: [1, 2, 2, 3, 3, 3]
Output: [[1, 1], [2, 2], [3, 3]]

 */
import java.util.*;

class CountFrequencies {

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

        List<List<Integer>> result = new ArrayList<>();

        for (int key : hm.keySet()) {
            List<Integer> pair = new ArrayList<>();
            pair.add(key);
            pair.add(hm.get(key));
            result.add(pair);
        }

        System.out.println(result);
    }
}

/* write a program to count the frequency of each element in an array and print the result.
example: 1: 1
          2: 2
          3: 3
          4: 1
 */
import java.util.HashMap;

public class CountFrequencies {

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4};
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();

        for (int num : arr) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        for (Integer key : frequencyMap.keySet()) {
            System.out.println(key + ": " + frequencyMap.get(key));
        }
    }
}

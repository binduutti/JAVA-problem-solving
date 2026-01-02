/* Move all zeros to the end of the array */
public class MoveZeroestoEnd {

    public static void main(String[] args) {
        int[] arr = {1, 3, 0, 3, 12};
        int n = arr.length;
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                k++;
            }
        }
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[index] = arr[i];
                index++;
            }
        }
        while (k > 0) {
            arr[n - k] = 0;
            k--;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}

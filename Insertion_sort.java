
import java.util.*;

public class Insertion_sort {

    public static int[] insertion_sort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of arr:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter numbers in arr:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] sorted = insertion_sort(arr);

        System.out.print("Sorted array (using insertion sort): ");
        System.out.println(Arrays.toString(sorted));
    }
}

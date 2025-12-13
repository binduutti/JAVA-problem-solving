
import java.util.*;

public class Bubble_sort {

    public static int[] bubble_sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }

            if (!swapped) {
                break;
            }
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

        int[] sorted = bubble_sort(arr);

        System.out.print("Sorted array (using bubble sort): ");
        System.out.println(Arrays.toString(sorted));
    }
}

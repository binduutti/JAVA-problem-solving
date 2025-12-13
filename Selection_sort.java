
import java.util.*;

public class Selection_sort {

    public static int[] selection_sort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            // swap AFTER finding minimum
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
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

        int[] sorted = selection_sort(arr);

        System.out.print("Sorted array (using selection sort): ");
        System.out.println(Arrays.toString(sorted));
    }
}

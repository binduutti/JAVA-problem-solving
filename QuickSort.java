
import java.util.*;

public class QuickSort {

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int s = lb;
        int e = ub;

        while (s < e) {
            while (arr[s] <= pivot && s < ub) {
                s++;
            }
            while (arr[e] > pivot) {
                e--;
            }
            if (s < e) {
                swap(arr, s, e);
            }
        }
        swap(arr, lb, e);
        return e;
    }

    public static void quicksort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quicksort(arr, lb, loc - 1);
            quicksort(arr, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        quicksort(arr, 0, n - 1);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}

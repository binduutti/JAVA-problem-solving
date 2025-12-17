
import java.util.*;

public class Mergesort {

    public static void mergeSort(int[] arr, int l, int u) {
        if (l >= u) {
            return;
        }

        int mid = (l + u) / 2;

        mergeSort(arr, l, mid);
        mergeSort(arr, mid + 1, u);
        merge(arr, l, mid, u);
    }

    public static void merge(int[] arr, int l, int mid, int u) {

        int[] mergeArr = new int[u - l + 1];
        int i = l;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= u) {
            if (arr[i] < arr[j]) {
                mergeArr[k++] = arr[i++];
            } else {
                mergeArr[k++] = arr[j++];
            }
        }

        while (i <= mid) {
            mergeArr[k++] = arr[i++];
        }

        while (j <= u) {
            mergeArr[k++] = arr[j++];
        }

        // Copy back to original array
        for (int idx = 0; idx < mergeArr.length; idx++) {
            arr[l + idx] = mergeArr[idx];
        }
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        mergeSort(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }
}

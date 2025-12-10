/*
write a program to reverse an array using recursion.
example:
Input: [1, 2, 3, 4, 5]
Output: [5, 4, 3, 2, 1]
 */
import java.util.*;

public class Rev_arr_Recursion {

    // Recursive function to reverse array
    public static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverse(arr, 0, n - 1);

        System.out.println("Reversed array:");
        System.out.println(Arrays.toString(arr));
    }
}

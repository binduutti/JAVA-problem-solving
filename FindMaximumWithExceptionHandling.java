/* This program finds the maximum of three numbers using exception handling */
import java.util.Scanner;

public class FindMaximumWithExceptionHandling {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the array size: ");
            int n = scanner.nextInt();
            int[] arr = new int[n];
            System.out.print("Enter the values for array: ");
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.max(max, arr[i]);
            }

            System.out.println("The maximum number is: " + max);
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }

    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

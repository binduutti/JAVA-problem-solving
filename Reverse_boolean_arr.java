/*
write a program to reverse an array of boolean values.
example: input: [true, false, true, false]
         output: [false, true, false, true]
         
 */
import java.util.*;

public class Reverse_boolean_arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of (boolean) array: ");
        int n = sc.nextInt();

        System.out.println("Enter (boolean) Values: ");
        boolean[] arr = new boolean[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextBoolean();
        }
        boolean[] revarr = new boolean[n];
        for (int i = arr.length - 1; i >= 0; i--) {
            revarr[n - i - 1] = arr[i];
        }

        System.out.println("Reversed (boolean) Array: " + Arrays.toString(revarr));
    }
}

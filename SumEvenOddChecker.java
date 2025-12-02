/*
❓ QUESTION:

Write a Java program that performs the following tasks:

1. Ask the user to enter the size of an array.
2. Read 'n' integer values into the array.
3. Calculate the sum of all the elements in the array.
4. Create a separate function that takes the sum as input and returns:
       - "even" if the sum is an even number
       - "odd" if the sum is an odd number
5. Finally, display the sum of the array elements along with whether
   the sum is even or odd.

Example:
Input:
Enter size of array: 4
Enter 4 values of array:
1 2 3 4

Output:
the sum of array is 10 and it is even
 */

import java.util.*;

public class SumEvenOddChecker {

    public static String fun(int sum) {
        if (sum % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.printf("Enter %d values of array:\n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }

        System.out.println("the sum of array is " + sum + " and it is " + fun(sum));
    }
}

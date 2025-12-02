/*
❓ QUESTION:

Write a Java program that performs the following tasks:

1. Ask the user to enter the size of an array.
2. Read 'n' integer values into the array.
3. Traverse the array and calculate the **sum of all even numbers only**.
4. Display the final sum of even elements.

Example:
Input:
Enter size of array: 6
Enter 6 values:
1 2 3 4 5 6

Output:
Sum of even numbers in array: 12
 */

import java.util.*;

public class SumOfEveninArrray {

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
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }
        System.out.println("Sum of even numbers in array: " + sum);
    }
}

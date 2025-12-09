/*
Write a recursive function to calculate the sum of first N natural numbers.
e.g., if N = 3, the output should be:
1 + 2 + 3 = 6

 */

import java.util.*;

public class Print_Sum_Recursion {

    public static int sum(int n) {
        if (n < 1) {
            return 0;
        }
        return n + sum(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println(sum(n));
    }
}

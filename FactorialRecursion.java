/*
write a program to find factorial of a number using recursion.
example:
Input: 5
Output: 120
 */

import java.util.*;

public class FactorialRecursion {

    public static int fact(int n) {
        if (n < 2) {
            return 1;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        System.out.println(fact(n));
    }
}

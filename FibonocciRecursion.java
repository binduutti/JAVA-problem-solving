/*
write a program to find nth Fibonacci number using recursion.
example:
Input: 6
Output: 8
 */
import java.util.*;

public class FibonocciRecursion {

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println(fibonacci(n));
    }
}

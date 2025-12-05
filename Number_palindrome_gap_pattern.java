/*
write a Java program to print the following number palindrome gap pattern up to n rows.
Input Number: 5
Expected Output:
    1             1
    1 2         2 1
    1 2 3     3 2 1
    1 2 3 4 4 3 2 1
 */
import java.util.*;

public class Number_palindrome_gap_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (int j = 0; j < 2 * (n - i); j++) {
                System.out.print("_ ");
            }

            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }
}

/*
Write a recursive function to print numbers from 1 to N.
e.g., if N = 3, the output should be:
1
2
3
 */

import java.util.*;

public class Print_N_Recursion {

    public static void printt(int n) {
        if (n < 1) {
            return;
        }
        printt(n - 1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        printt(n);
    }
}

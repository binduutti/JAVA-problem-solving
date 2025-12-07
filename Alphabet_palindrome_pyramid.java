/*
write a program to print the following pattern for given number of rows.
Sample Output for n=5:
        A
      A B A
    A B C B A
  A B C D C B A
 */

import java.util.*;

public class Alphabet_palindrome_pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int start = 65; // 'A'

        for (int i = start; i < start + n; i++) {

            for (int j = i + 1; j < start + n; j++) {
                System.out.print("  ");
            }

            for (int k = start; k <= i; k++) {
                System.out.print((char) k + " ");
            }

            for (int l = i - 1; l >= start; l--) {
                System.out.print((char) l + " ");
            }

            System.out.println();
        }
    }
}

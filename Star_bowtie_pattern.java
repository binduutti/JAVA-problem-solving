/*
Star Bowtie Pattern
Write a Java program to print the star bowtie pattern.
Sample Output for n=5:

* * * * * * * * * * 
* * * *     * * * * 
* * *         * * * 
* *             * * 
*                 * 
*                 * 
* *             * * 
* * *         * * * 
* * * *     * * * * 
* * * * * * * * * *
 */
import java.util.*;

public class Star_bowtie_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // TOP HALF
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }

            for (int k = 0; k < i * 2; k++) {
                System.out.print("  ");
            }

            for (int l = i; l < n; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }

        // BOTTOM HALF
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }

            for (int k = 0; k < 2 * (n - i - 1); k++) {
                System.out.print("  ");
            }

            for (int l = 0; l <= i; l++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}

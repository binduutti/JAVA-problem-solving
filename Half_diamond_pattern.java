/*
write a program to print the following half diamond pattern for a given number of rows.
For example, if the input number is 5, the output should be:
*
**
***
****
*****
****
***
**
*
 */
import java.util.*;

public class Half_diamond_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i < n + 1; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

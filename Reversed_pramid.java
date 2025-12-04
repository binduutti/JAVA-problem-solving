/*
write a program to print the following reversed pyramid pattern for a given number of rows.
For example, if the input number is 5, the output should be:
*********
 *******
  *****
   ***
    *
        
 */
import java.util.*;

public class Reversed_pramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

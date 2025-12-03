/*
write a java program to print a star pyramid pattern based on user input.
For example, for n = 5, the output should be:
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *

 */
import java.util.*;

public class Star_pyramid {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Write a Java program to print a hollow square star pattern.
Sample Output:
* * * * *
*       *
*       *
*       *
* * * * *

 */
import java.util.*;

public class Hollow_square {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                if ((i == 0 || i == n) || (j == 0 || j == n)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

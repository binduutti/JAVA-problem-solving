/*
Write a program to print the following pattern for a given number n.
For n = 5
* * * * *
* * * *
* * *
* *
*

 */
import java.util.*;

public class Inverted_star_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = n + 1; j > i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

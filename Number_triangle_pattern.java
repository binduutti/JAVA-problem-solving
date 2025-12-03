/*
write a program to print the following pattern for given number n.
for n=5
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
 */

import java.util.*;

public class Number_triangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}

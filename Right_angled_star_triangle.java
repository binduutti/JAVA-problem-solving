/*
Problem: Print a Right-Angled Star Triangle Pattern

Description:
Write a program that takes an integer input 'n' from the user and prints a right-angled triangle pattern of stars (*) 
with 'n' rows. Each row i (1 <= i <= n) should contain exactly i stars, separated by a space.

Input:
- An integer n (1 <= n <= 100), representing the number of rows of the triangle.

Output:
- A right-angled triangle of stars with 'n' rows.

Example:

Input:
5

Output:
* 
* * 
* * * 
* * * * 
* * * * * 
 */

import java.util.*;

public class Right_angled_star_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

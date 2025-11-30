/* 
Write a program in Java to print an n x n square pattern using asterisks (*).

Input:
A single integer n.

Output:
An n x n square where each row contains n stars.

Example:
Input:
4

Output:
* * * *
* * * *
* * * *
* * * *
 */

import java.util.*;

public class Squarepattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

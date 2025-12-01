/*
Problem: Sum of Digits of a Number

Description:
Write a program that takes an integer input from the user and calculates the sum of its digits.
The program should repeatedly extract the last digit of the number and add it to a running total
until the number becomes zero.

Input:
- An integer n (can be positive or negative).

Output:
- The sum of all digits in the number.

Example:

Input:
Enter num:
456

Output:
15
(Explanation: 4 + 5 + 6 = 15)
 */

import java.util.*;

public class Sum_of_integer {

    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        System.out.println(sum);
    }
}

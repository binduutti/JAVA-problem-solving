/*
    Write a program to reverse a given integer number.

    The program should:
        - Take an integer input from the user.
        - Extract each digit from the number.
        - Construct the reversed number by appending digits in reverse order.
        - Print the reversed number as output.

    Example:
        Input:  12345
        Output: 54321

        Input: 907
        Output: 709
 */

import java.util.*;

public class Reverse_integer {

    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String rev = "";

        while (n > 0) {
            int num = n % 10;
            rev += num;
            n = n / 10;
        }
        int revInt = Integer.parseInt(rev);
        System.out.println(revInt);
    }
}

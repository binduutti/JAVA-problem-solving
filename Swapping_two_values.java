/*
Write a Java program to swap the values of two numbers using a temporary
variable.

The program should:
1. Ask the user to enter the first number.
2. Ask the user to enter the second number.
3. Swap the values of the two numbers using a temporary variable.
4. Print the values of number1 and number2 after swapping.

Example:
Input:
number1 = 5
number2 = 9

Output:
number1 val: 9
number2 val: 5
 */

import java.util.*;

public class Swapping_two_values {

    public static void main(String[] args) {
        System.out.println("Enter number1:");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();

        System.out.println("Enter number2:");
        int n2 = sc.nextInt();

        int temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println("number1 val: " + n1 + "\nnumber2 val: " + n2);

    }
}

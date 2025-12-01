
/*
    Write a program to check whether a given number is an Armstrong number.

    A number is called an Armstrong number if the sum of its digits, 
    each raised to the power of the total number of digits, 
    is equal to the original number.
    
    Examples:
        Input: 153
        Explanation: 1^3 + 5^3 + 3^3 = 153  → Armstrong Number

        Input: 370
        Explanation: 3^3 + 7^3 + 0^3 = 370  → Armstrong Number

        Input: 123
        Explanation: 1^3 + 2^3 + 3^3 = 36 ≠ 123  → Not Armstrong

    Task:
        - Take an integer input from the user.
        - Check if it is an Armstrong number.
        - Print "Yes" if it is Armstrong, otherwise print "No".
 */
import java.util.*;

public class Armstrong_num_or_not {

    public static void main(String[] args) {
        System.out.println("Enter num:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (isArmstrong(n)) {
            System.out.println("yes,its a Armstrong number");
        } else {
            System.out.println("No,,its not a Armstrong number");
        }
    }

    public static int length_of_num(int n) {
        int length = 0;
        while (n > 0) {
            length += 1;
            n = n / 10;
        }
        return length;
    }

    public static boolean isArmstrong(int n) {
        int temp = n;
        int sum = 0;
        int length = length_of_num(n);
        while (n > 0) {
            int num = n % 10;
            sum += Math.pow(num, length);
            n = n / 10;
        }
        return temp == sum;
    }
}

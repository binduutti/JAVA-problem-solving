/*
Write a java program to check whether a given number is a prime number.

The program should:
1. Ask the user to enter a number.
2. Determine whether the number is prime.
   - A prime number is a number greater than 1 that has no divisors 
     other than 1 and itself.
3. Print:
   - true or false (indicating prime status)
   - A message: "yes its a prime number" or "no its not a prime number"

Example:
Input:
Enter number:
7

Output:
true
yes its a prime number

 */
import java.util.*;

public class Prime_num_or_not {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        boolean prime = true;
        if (n < 2) {
            prime = false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                prime = false;
            }
        }
        System.out.println(prime);

        if (prime) {
            System.out.println("yes its a prime number");
        } else {
            System.out.println("no its not a prime number");
        }
    }
}

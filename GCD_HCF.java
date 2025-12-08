/*
write a java program to find GCD or HCF of two numbers and also count total number of divisors of GCD or HCF.
example:
Input: num1=12, num2=15
Output: GCD or HCF=3, Total divisors=2 (1,3)
 */

import java.util.*;

public class GCD_HCF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the number2: ");
        int n2 = sc.nextInt();
        int divisors = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                divisors++;
            }
        }
        System.out.println("Total divisors: " + divisors);
    }
}

/*
write a program to check whether a given string is a palindrome using recursion.
example:
Input: "madam"
Output: "Palindrome"
 */

import java.util.*;

public class PalindromeRecursion {

    public static String reverse(String s) {
        if (s.length() == 0) {
            return "";
        }
        return s.charAt(s.length() - 1) + reverse(s.substring(0, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String s = sc.nextLine();

        String rev = reverse(s);
        if (s.equals(rev)) {
            System.out.println("Palindrome"); 
        }else {
            System.out.println("Not palindrome");
        }
    }
}

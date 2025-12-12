/*
Write a program to check if the sum of even numbers is equal to the sum of odd numbers
from a given list of integers.
e.g.
Input: [1, 2, 3, 4, 5, 6
Output: True
 */
import java.util.*;

public class EvenOddSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        s = s.replace("[", " ")
                .replace("]", " ")
                .replace(",", " ");

        String[] parts = s.trim().split("\\s+");
        int sumEven = 0, sumOdd = 0;

        for (String str : parts) {
            int num = Integer.parseInt(str);

            if (num % 2 == 0) {
                sumEven += num;
            } else {
                sumOdd += num;
            }
        }

        if (sumEven == sumOdd) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}

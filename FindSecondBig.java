/*
write a program to find the second greatest among three numbers.
e.g.
Input: 3 7 5
Output: 5
 */
import java.util.*;

public class FindSecondBig {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("a is second greatest");
        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("b is second greatest");
        } else {
            System.out.println("c is second greatest");
        }
    }
}

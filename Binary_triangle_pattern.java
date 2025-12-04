/*
write a program to print the following binary triangle pattern for a given number of rows.
For example, if the input number is 5, the output should be:
1
10
101
1010
10101

 */
import java.util.*;

public class Binary_triangle_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                if (((i + j) % 2) != 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}

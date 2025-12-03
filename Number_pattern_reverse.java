/*
write a program to print the following pattern for a given number n.
For n = 5

1 2 3 4 5
1 2 3 4
1 2 3
1 2
1

 */
import java.util.*;

public class Number_pattern_reverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print((n - j + 1) + " ");
            }
            System.out.println();
        }
    }
}

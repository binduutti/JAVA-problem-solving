/*
write a Java program to print the following continuous number triangle pattern up to n rows.
Input Number: 5
Expected Output:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
 */
import java.util.*;

public class Continuous_number_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int val = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val++;
            }
            System.out.println();
        }
    }
}

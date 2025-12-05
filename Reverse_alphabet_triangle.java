/*
write a Java program to print the following reverse alphabet triangle pattern up to n rows.
Input Number: 6
Expected Output:
A B C D E F
A B C D E
A B C D
A B C
A B
A
 */
import java.util.*;

public class Reverse_alphabet_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int start = 65; // ASCII 'A'

        for (int i = n; i >= 1; i--) {
            for (int j = start; j < start + i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}

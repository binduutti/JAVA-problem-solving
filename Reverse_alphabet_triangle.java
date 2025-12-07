
/**
 * Write a Python program to print the reverse alphabet triangle pattern.
 * Sample Output:
 * E
 * D E
 * C D E
 * B C D E
 * A B C D E
 */
import java.util.Scanner;

public class Reverse_alphabet_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int start = 65 + n;

        for (int i = start; i > start - n; i--) {
            for (int j = i; j < start; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}

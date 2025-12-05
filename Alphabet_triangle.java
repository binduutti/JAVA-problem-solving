/*
write a Java program to print the following alphabet triangle pattern up to n rows.
Input Number: 6
Expected Output:
A
A B
A B C
A B C D
A B C D E
 */
import java.util.*;

public class Alphabet_triangle {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int start = 65;
        for (int i = start; i < start + n; i++) {
            for (int j = start; j <= i; j++) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}

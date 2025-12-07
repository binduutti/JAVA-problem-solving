/*
write a Java program to print the alphabet repeat pattern.
Sample Output for n=5:
A
BB
CCC
DDDD
EEEEE
 */
import java.util.Scanner;

public class Alphabet_repeat_pattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int start = 65; // ASCII value of 'A'

        for (int i = start; i < start + n; i++) {
            for (int j = start; j <= i; j++) {
                System.out.print((char) i);
            }
            System.out.println();
        }
    }
}

/*
Write a recursive function to print your name N times.
e.g., if N = 3, the output should be:
SAI BINDU
SAI BINDU
SAI BINDU
 */
import java.util.*;

public class PrintNameRecursion {

    public static void printt(int n) {
        if (n < 1) {
            return;
        }
        System.out.println("Sai Bindu");
        printt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        printt(n);
    }
}

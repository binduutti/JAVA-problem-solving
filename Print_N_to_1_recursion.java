
/*
write a recursive function to print numbers from N to 1.
e.g., if N = 3, the output should be:
3
2
1
 */
import java.util.*;

public class Print_N_to_1_recursion {

    public static void printt(int n) {
        if (n < 1) {
            return;
        }
        System.out.println(n);
        printt(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        printt(n);
    }
}

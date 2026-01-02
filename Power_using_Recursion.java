/* Calculate the power of a number using recursion. */
import java.util.*;

public class Power_using_Recursion {

    public static int power(int x, int n) {
        if (n == 0) {
            return 1;
        }
        return x * power(x, n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x number");
        int x = sc.nextInt();
        System.out.println("Enter n number");
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}

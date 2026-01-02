/*Count the number of digits in a given number using recursion.*/
import java.util.*;

public class CountDigits_using_Recursion {

    public static int count(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return 1 + count(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int n = sc.nextInt();

        System.out.println(count(n));
    }
}

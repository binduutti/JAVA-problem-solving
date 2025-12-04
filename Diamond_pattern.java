
import java.util.*;

public class Diamond_pattern {

    public static void Daimond_p(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = sc.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * i - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }
        for (int i = 1; i < n + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2 * (n - i) - 1); k++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}

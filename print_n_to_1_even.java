
import java.util.*;

public class print_n_to_1_even {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = n; i > 0; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}

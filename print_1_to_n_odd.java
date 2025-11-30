
import java.util.*;

public class print_1_to_n_odd {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
        }
    }
}

import java.util.*;

public class print_1_to_n_numbers {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
	}
}
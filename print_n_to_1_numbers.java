import java.util.*;
public class print_n_to_1_numbers
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=n;i>=1;i--){
	        System.out.print(i+" ");
	    }
	}
}
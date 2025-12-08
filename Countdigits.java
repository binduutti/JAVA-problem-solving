/*
  Write a java program to count total digits in a number.
    Example:
    Input: num=12345
    Output: Total digits=5
    
 */
import java.util.*;

public class Countdigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count += 1;
            n = n / 10;
        }
        System.out.println("Total digits in number: " + count);
    }
}

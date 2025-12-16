/*
write a program to find the longest string in an array of strings.
example: input: ["apple", "banana", "cherry", "date"]
         output: "banana"
 */
import java.util.*;

public class MaxlenValue_in_arr {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Size of (String) array: ");
        int n = sc.nextInt();

        System.out.println("Enter (String) Values: ");
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        int maxlen = 0;
        String maxlenval = "";

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() > maxlen) {
                maxlen = arr[i].length();
                maxlenval = arr[i];
            }
        }

        System.out.println("Longest String: " + maxlenval);
    }
}

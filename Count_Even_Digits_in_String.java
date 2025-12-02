/*
Write a Java program that reads a string from the user and counts how many digits in the string are even.
Digits range from '0' to '9'.
Print the total count of even digits present in the string.
 */
import java.util.*;

public class Count_Even_Digits_in_String {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                if (c % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("count of even digits in String:" + count);
    }
}

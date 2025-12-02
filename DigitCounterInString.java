/*
Program Name: DigitCounterInString

Question:
Write a Java program that reads a string from the user and counts how many 
digits (0–9) are present in the string. The program should check each 
character using a suitable method (like Character.isDigit()) and finally 
print the total number of digits found in the input string.
 */
import java.util.*;

public class DigitCounterInString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String s = sc.nextLine();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                count++;
            }
        }
        System.out.println("count of digits in String:" + count);
    }
}

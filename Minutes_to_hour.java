/* 
write a Java program to convert minutes into hours and minutes.
The program should:
1. Take an integer input representing the total number of minutes.
2. Calculate the equivalent hours and remaining minutes.
3. Print the result in the format "X hours, Y minutes".
Example:
Input:
Enter minutes:
120
Output:
2 hours, 0 minutes
 */

import java.util.*;

public class Minutes_to_hour {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter minutes");
        int n = sc.nextInt();

        int hours = n / 60;
        int min = n % 60;

        System.out.println(hours + " hours, " + min + " min");

    }
}

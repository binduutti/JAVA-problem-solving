/* write a program to add one to a number represented as an array of digits.
   Example:
    Input: [1,2,3]
    Output: [1,2,4]
    Explanation: The array represents the integer 123.
    Input: [9,9,9]
    Output: [1,0,0,0]
    Explanation: The array represents the integer 999.
*/
import java.util.*;
public class AddOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] strArr = input.split(" ");
        int n = strArr.length;
        int[] digits = new int[n];
        for (int i = 0; i < n; i++) {
            digits[i] = Integer.parseInt(strArr[i]);
        }
        int[] result = addOne(digits);
        System.out.println(Arrays.toString(result));
        sc.close();
    }

    public static int[] addOne(int[] digits) {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] != 9) {
                digits[i]++;
                return digits;
            } else {
                digits[i] = 0;
            }
        }
        int[] newNumber = new int[n + 1];
        newNumber[0] = 1;
        return newNumber;
    }
}
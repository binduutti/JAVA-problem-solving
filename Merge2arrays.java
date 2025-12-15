/*
merge two arrays of strings
This program merges two arrays of strings into a single array.
It prompts the user to enter the size and elements of each array,
then combines them into a new array and prints the result.
Example:
Enter size of (String) array1:
4
Enter String values:
apple banana cherry date
Enter size of (String) array2:
5
Enter String values:
kiwi lemon mango orange pear
Merged array:
[apple, banana, cherry, date, kiwi, lemon, mango, orange, pear]
 */
import java.util.*;

public class Merge2arrays {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of (String) array1: ");
        int n1 = sc.nextInt();
        String[] arr1 = new String[n1];
        System.out.println("Enter String values: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.next();
        }

        System.out.println("Enter size of (String) array2: ");
        int n2 = sc.nextInt();
        String[] arr2 = new String[n2];
        System.out.println("Enter String values: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.next();
        }

        String[] mergedarr = new String[n1 + n2];
        int m_len = mergedarr.length;
        for (int i = 0; i < n1; i++) {
            mergedarr[i] = arr1[i];
        }
        for (int i = 0; i < n2; i++) {
            mergedarr[n1 + i] = arr2[i];
        }

        System.out.println(Arrays.toString(mergedarr));
    }
}

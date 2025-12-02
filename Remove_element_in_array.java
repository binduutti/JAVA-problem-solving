/*Q: Write a Java program that removes all occurrences of a given element from an array 
   and displays the array before and after deletion.
the program should:
1. Ask the user to enter the size of the array.
2. Ask the user to enter the elements of the array.
3. Ask the user to enter the element to be removed.
4. Remove all occurrences of the specified element from the array.
5. Print the array before and after the removal of the element.
Example:
Input:
Enter size of array:
5
Enter elements of array:
1 2 3 2 4
Enter element to be removed:
2
Output:
Original array:
1 2 3 2 4
Array after removing 2:
1 3 4
 */
import java.util.*;

public class Remove_element_in_array {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter array size:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.printf("Enter %d values of array:\n", n);
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter element to remove from array:");
        int ele = sc.nextInt();

        int count = 0;
        for (int x : arr) {
            if (x == ele) {
                count++;
            }
        }

        if (count == 0) {
            System.out.println("Element not found in array. No deletion performed.");
            return;
        }

        int[] newArr = new int[n - count];
        int j = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] != ele) {
                newArr[j++] = arr[i];
            }
        }

        System.out.println("Array before eliminating element:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        System.out.println("\nArray after eliminating element:");
        for (int x : newArr) {
            System.out.print(x + " ");
        }
    }
}

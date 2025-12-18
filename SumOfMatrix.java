/*
write a program to calculate the sum of all elements in a matrix.
example:
Input:
1 2 3
4 5 6
7 8 9
Output:
Matrix:
1 2 3
4 5 6
7 8 9
Sum of matrix: 45
 */
import java.util.*;

public class SumOfMatrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows: ");
        int rowSize = sc.nextInt();
        int[][] arr = new int[rowSize][];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter the column size in row number " + i);
            int colSize = sc.nextInt();
            arr[i] = new int[colSize];
            System.out.println("Enter the column values for row: " + i);
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        System.out.println("Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
                sum += arr[i][j];
            }
            System.out.println();
        }
        System.out.println("Sum of matrix: " + sum);
        sc.close();
    }
}

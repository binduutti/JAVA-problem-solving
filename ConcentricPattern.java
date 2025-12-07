/*
Given an integer n, generate a square matrix of size (2n-1) x (2n-1) filled with concentric layers of integers from n down to 1.
For example, for n = 3, the output should be:
3 3 3 3 3
3 2 2 2 3
3 2 1 2 3
3 2 2 2 3
3 3 3 3 3
 */
import java.util.Scanner;

public class ConcentricPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int size = 2 * n - 1;
        int[][] mat = new int[size][size];

        int left = 0, right = size - 1;
        int top = 0, bottom = size - 1;
        int num = n;

        while (num > 0) {

            // Fill top row
            for (int i = left; i <= right; i++) {
                mat[top][i] = num;
            }

            // Fill bottom row
            for (int i = left; i <= right; i++) {
                mat[bottom][i] = num;
            }

            // Fill left column
            for (int i = top; i <= bottom; i++) {
                mat[i][left] = num;
            }

            // Fill right column
            for (int i = top; i <= bottom; i++) {
                mat[i][right] = num;
            }

            // Shrink boundary
            left++;
            right--;
            top++;
            bottom--;
            num--;
        }

        // Print matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}

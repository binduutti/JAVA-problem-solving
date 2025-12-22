/*
Write a Java program to add two 3×3 matrices and display the resulting matrix.

The program should:

Store two predefined 3×3 matrices

Add corresponding elements of both matrices

Print the resultant matrix after addition

 */
public class SumOf2Matrices {

    public static void main(String[] args) {
        int[][] mat1 = {{1, 2, 1}, {9, 7, 2}, {7, 6, 4}};
        int[][] mat2 = {{2, 6, 8}, {0, 1, 3}, {1, 2, 4}};

        int[][] opmat = new int[3][3];

        for (int i = 0; i < opmat.length; i++) {
            for (int j = 0; j < opmat[i].length; j++) {
                opmat[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        //display output matrix
        for (int i = 0; i < opmat.length; i++) {
            for (int j = 0; j < opmat[i].length; j++) {
                System.out.print(opmat[i][j] + " ");
            }
            System.out.println();
        }

    }
}

package Array;

import java.util.Arrays;

public class TransposeMatrixInplace {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("matrix");
        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        System.out.println("transpose matrix");
        for(int[] arr:matrix){
            System.out.println(Arrays.toString(arr));
        }
    }
}

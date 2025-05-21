package Array;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};

        System.out.println("matrix");
        for(int[] arr:matrix){
            for(int val:arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }

        int[][] transpose = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("transpose matrix");
        for(int[] arr:transpose){
            for(int val:arr){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}

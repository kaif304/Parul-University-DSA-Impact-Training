package Array;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        int val = 10;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = val;
                val += 10;
            }
        }

        // print the array
        for(int[] array : arr){
            for(int num : array){
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Direct Initialization
        // JVM will handle all the heap/memory allocation

        int[][] arr2 = {{10,20,30}, {40,50,60}, {70,80,90}};
    }
}

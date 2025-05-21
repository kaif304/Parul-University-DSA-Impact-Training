package Array;

public class StoreDataInArray {
    public static void main(String[] args) {
        int[] arr; // declaration
        arr = new int[5]; // memory allocation

        // initialization
        for(int i = 0; i < arr.length; i++){
            arr[i] = 10;
        }

        // accessing array values
        for(int val : arr){
            System.out.print(val+" ");
        }

        int[] integers = {10, 20, 30};
        boolean[] booleans = {true, false, true};
        char[] characters = {'a', 'b', 'c'};
    }
}

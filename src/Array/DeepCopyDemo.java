package Array;

import java.util.Arrays;

public class DeepCopyDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        int[] copyArr = new int[arr.length];
        // deep copy
        for(int i = 0; i < arr.length; i++){
            copyArr[i] = arr[i];
        }

        // pre-built
        // copyArr = Arrays.copyOfRange(arr, 0, arr.length);

        for(int val : copyArr){
            System.out.print(val+" ");
        }
    }
}

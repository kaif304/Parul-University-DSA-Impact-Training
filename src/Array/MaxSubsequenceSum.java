package Array;

import java.util.Arrays;

public class MaxSubsequenceSum {
    static int max = Integer.MIN_VALUE;
    static int maxSum(int[] arr){
        helper(0, arr);
        return max;
    }
    static void helper(int sum, int[] arr){
        if(arr.length == 0){
            max = Math.max(max, sum);
            return;
        }
        System.out.println(sum);
        helper(sum+arr[0], Arrays.copyOfRange(arr, 1, arr.length));
        helper(sum, Arrays.copyOfRange(arr, 1, arr.length));
    }
    public static void main(String[] args) {
        int arr[] = {-4,11,-5,2,-4,-2,-1};
        System.out.println(maxSum(arr));
    }
}

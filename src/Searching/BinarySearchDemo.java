package Searching;

public class BinarySearchDemo {
    public static void main(String[] args) {
        // array must be sorted always
        int[] arr = {10,20,30,40,50};

        int left = 0, right = arr.length-1;
        int target = 50;
        boolean found = false;

        while(left < right){
            int mid = left + (right - left) / 2;

            if(arr[mid] == target){
                System.out.println("Target index: "+mid);
                found = true;
            }

            if(arr[mid] < target){
                left = mid+1;
            }
            else {
                right = mid-1;
            }
        }

        if(!found){
            System.out.println("Target not available");
        }
    }
}

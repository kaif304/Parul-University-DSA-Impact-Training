package Searching;

public class LinearSearchDemo {
    public static void main(String[] args) {
        int[] arr = {1,15,16,70,2};

        int target = 16;
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                System.out.println("searching object index: "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Target is not available");
        }
    }
}

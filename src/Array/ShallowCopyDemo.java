package Array;

public class ShallowCopyDemo {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40};

        int[] copyArr = arr;

        // manipulating value of copyArr
        copyArr[2] = 100;

        System.out.println("original array");
        for(int val : arr){
            System.out.print(val+" ");
        }
        System.out.println("\n");


        System.out.println("shallow copy array");
        for(int val : copyArr){
            System.out.print(val+" ");
        }
    }
}

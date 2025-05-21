package LinkedList;

public class ArrayLimitations {
    public static void main(String[] args) {
        int[] arr = new int[50];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;

        for(int ele:arr){
            System.out.println(ele);
        }
        // except first three, all other data is useless and extra
        // so memory wastage
    }
}

package Array;

public class NumberStartingWithEven {
    static boolean isFirstDigitEven2(int num){
        while(num > 9){
            num /= 10;
        }
        return num % 2 == 0;
    }
    static boolean isFirstDigitEven(int num){
        int first = num % 10;
        while(num > 0){
            first = num % 10;
            num /= 10;
        }
        return first % 2 == 0;
    }
    static void printAllEven(int[] arr){
        for(int num : arr){
            if(isFirstDigitEven(num)){
                System.out.print(num+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {2,99,1,24,65,12457,88,97,1456};
        printAllEven(arr);
    }
}

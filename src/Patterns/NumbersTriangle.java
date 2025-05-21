package Patterns;

public class NumbersTriangle {
    static void printNumbersTriangle(int n){
        int num = 2;
        for(int i = 0; i < n; i++){
            for (int j = 0; j <= i; j++) {
                System.out.print(num + " ");
                num += 2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printNumbersTriangle(5);
    }
}

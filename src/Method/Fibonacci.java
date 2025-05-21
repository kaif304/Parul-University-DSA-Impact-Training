package Method;

public class Fibonacci {
    public static void main(String[] args) {
        printFibonacci(10);
    }
    static int printFibonacci(int n){
        if(n <= 1){
            return n;
        }
        int curr = printFibonacci(n - 1) + printFibonacci(n - 2);
        System.out.print(" "+curr);
        return curr;
    }
}

package Recursion;

public class Factorial {
    static int fact(int n){
        if(n == 1) return 1;
        else return n * fact(n-1);
    }
    public static void main(String[] args) {
        int n = 6;
        System.out.println("factorial of "+n+" : "+fact(n));
    }
}

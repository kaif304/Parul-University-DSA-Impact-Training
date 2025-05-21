package Recursion;

public class MakeSumOfNNumbers {
    static int sum(int N){
        if(N == 1) return 1;
        else return N + sum(N-1);
    }
    public static void main(String[] args) {
        System.out.println(sum(10));
    }
}

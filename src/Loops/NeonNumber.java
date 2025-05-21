package Loops;

public class NeonNumber {
    static void isNeon(int num){
        int n = num*num, sum = 0;
        while(n > 0){
            sum += (n % 10);
            n /=10;
        }
        if(sum == num)
            System.out.println(num+" is a Neon number");
        else
            System.out.println(num+" is not a Neon number");
    }

    public static void main(String[] args) {
        isNeon(9);
        isNeon(12);
        isNeon(45);
    }
}

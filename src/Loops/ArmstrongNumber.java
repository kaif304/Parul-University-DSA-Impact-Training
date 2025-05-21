package Loops;

public class ArmstrongNumber {
    static int digitCount(int n){
        int count = 0;
        while(n > 0){
            count++;
            n /= 10;
        }
        return count;
    }
    static boolean isArmstrong(int num){
        int n = num, sum = 0;
        int power = digitCount(n); // number of digits

        while(n > 0){
            int rem = n % 10;
            sum += ((int) Math.pow(rem, power));
            n /= 10;
        }

        return sum == num;
    }
    public static void main(String[] args) {
        int number = 153;

        if(isArmstrong(number)){
            System.out.println("armstrong");
        }
        else {
            System.out.println("not an armstrong");
        }
    }
}

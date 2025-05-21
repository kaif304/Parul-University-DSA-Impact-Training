package Loops;

public class ReverseGivenNumber {
    static void reverse(int num){
        int rev = 0;
        while(num > 0){
            rev = (rev * 10) + (num % 10);
            num /= 10;
        }
        System.out.println("Reversed: "+rev);
    }

    public static void main(String[] args) {
        reverse(123);
        reverse(12423);
        reverse(4256);
        reverse(100);
    }
}

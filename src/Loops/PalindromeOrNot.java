package Loops;

public class PalindromeOrNot {
    static int reverse(int n){
        int rev = 0;
        while(n > 0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev;
    }
    static void isPalindrome(int num){
        int rev = reverse(num);

        if(rev == num)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
    }
    public static void main(String[] args) {
        isPalindrome(121);
        isPalindrome(100);
    }
}

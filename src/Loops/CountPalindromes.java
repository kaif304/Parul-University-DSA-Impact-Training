package Loops;

public class CountPalindromes {
    static boolean isPalindrome(int num){
        int rev = 0, n = num;
        while(n > 0){
            rev = (rev * 10) + (n % 10);
            n /= 10;
        }
        return rev == num;
    }
    static void countPalindromes(){
        int count = 0;
        for (int i = 1; i <= 1000; i++) {
            if(isPalindrome(i)){
                count++;
            }
        }
        System.out.println(count+" palindromes in range [1,1000]");
    }
    public static void main(String[] args) {
        countPalindromes();
    }
}

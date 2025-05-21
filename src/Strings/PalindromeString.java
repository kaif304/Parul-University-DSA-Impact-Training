package Strings;

public class PalindromeString {
    static boolean palindromeOrNot(String s){
        int left = 0, right = s.length()-1;

        while(left > right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
    public static void main(String[] args) {
        String s = "abccba";

        if(palindromeOrNot(s))
            System.out.print("String s is palindrome");
        else
            System.out.print("String s is not palindrome");
    }
}

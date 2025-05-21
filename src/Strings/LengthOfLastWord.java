package Strings;

public class LengthOfLastWord {
    static int lengthOfLastWord(String s){
        int i = s.length()-1;
        int len = 0;

        while(i >= 0 && s.charAt(i) == ' '){
            i--;
        }
        while(i >= 0 && s.charAt(i) != ' '){
            i--;
            len++;
        }
        return len;
    }
    static int lengthOfLastWord2(String s){
        String[] charArr = s.trim().split(" ");
        return charArr[charArr.length-1].length();
    }

    public static void main(String[] args) {
        String s = "  fly me to the moon  ";

        System.out.println("Length of last word: "+lengthOfLastWord(s));
    }
}

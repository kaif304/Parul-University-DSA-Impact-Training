package Strings;

public class CountVowels {
    public static void main(String[] args) {
        String s = "how are you my friend";
        int vowels = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if("aeiou".indexOf(ch) != -1){
                vowels++;
            }
        }

        System.out.println("Number of vowels: "+vowels);
    }
}

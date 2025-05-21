package Strings;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        String s = "how are you my friend";
        int vowels = 0;
        int consonants = 0;
        int spaces = 0;

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);

            if("aeiou".indexOf(ch) != -1){
                vowels++;
            }
            else if(ch >= 'a' && ch <= 'z'){
                consonants++;
            }
            else if(ch == 32){
                spaces++;
            }
        }

        System.out.println("Number of vowels: "+vowels);
        System.out.println("Number of consonants: "+consonants);
        System.out.println("Number of spaces: "+spaces);
    }
}

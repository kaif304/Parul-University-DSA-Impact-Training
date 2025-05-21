package Searching;

public class FindVowelIndex {
    public static void main(String[] args) {
        char[] chars = {'m','y','z','a','d','k'};
        String vowels = "aeiou";
        boolean found = false;

        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];

            if(vowels.indexOf(ch) != -1){
                System.out.println("Index of vowel '"+ch+"' -> "+i);
                found = true;
                break;
            }
        }

        if(!found){
            System.out.println("Vowel does not exist!");
        }
    }
}

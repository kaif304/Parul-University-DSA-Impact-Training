package Sorting;

public class AlphabeticalOrder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("bharat");

        for (int i = 0; i < sb.length(); i++) {
            for (int j = i+1; j < sb.length(); j++) {
                if(sb.charAt(j) < sb.charAt(i)){
                    // swap now - we got a lesser value
                    char temp = sb.charAt(i);
                    sb.setCharAt(i, sb.charAt(j));
                    sb.setCharAt(j, temp);
                }
            }
        }

        System.out.println(sb);
    }
}

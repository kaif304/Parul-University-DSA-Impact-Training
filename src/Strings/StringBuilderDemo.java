package Strings;

public class StringBuilderDemo {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("My name is kaiff");

        // modify name
        sb.replace(sb.length()-5, sb.length(), "Kaif");

        System.out.println(sb);
    }
}

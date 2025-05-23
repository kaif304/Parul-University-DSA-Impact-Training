package Stack;

import java.util.Stack;

public class ReverseStringUsingStack {
    public static void main(String[] args) {
        String string = "kaif";

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < string.length(); i++) {
            stack.push(string.charAt(i));
        }

        StringBuilder reversedString = new StringBuilder();
        while(!stack.isEmpty()){
            reversedString.append(stack.pop());
        }

        string = reversedString.toString();

        System.out.println(string);
    }
}

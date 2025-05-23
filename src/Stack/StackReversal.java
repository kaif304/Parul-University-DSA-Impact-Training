package Stack;

import java.util.SimpleTimeZone;
import java.util.Stack;

public class StackReversal {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("hello");
        stack.push("hi");
        stack.push("namaste");

        Stack<String> reversedStack = new Stack<>();

        while(!stack.isEmpty()){
            reversedStack.push(stack.pop());
        }

        while (!reversedStack.isEmpty()){
            System.out.println(reversedStack.pop());
        }
    }
}

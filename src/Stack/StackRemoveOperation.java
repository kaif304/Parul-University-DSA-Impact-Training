package Stack;

import java.util.Stack;

public class StackRemoveOperation {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("java");
        stack.push("c++");
        stack.push("python");

        // remove method
        stack.remove("c++");

        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

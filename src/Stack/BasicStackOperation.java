package Stack;

import java.util.Stack;

public class BasicStackOperation {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // add
        System.out.println(stack.add(10)); // returns true
        // push
        System.out.println(stack.push(20)); // returns 20

        stack.addElement(30); // returns 20

        // traversing the stack
        while(!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }
}

package assignments.stackusingarray;

public class Main {
    public static void main(String[] args) {
        CustomStack stack = new CustomStack(3);

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);

        System.out.println("popped: "+stack.pop());
        System.out.println("popped: "+stack.pop());

        System.out.println("peek item: "+stack.peek());

        stack.printStack();
    }
}

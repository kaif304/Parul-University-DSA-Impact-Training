package assignments.stackusingarray;

public class CustomStack {
    int[] stack;
    int index;

    public CustomStack(){
        this.stack = new int[10]; // stack with initial size 10
        this.index = -1;
    }
    public CustomStack(int size){ // user given stack size
        this.stack = new int[size]; // stack with initial size given by user
        this.index = -1;
    }

    public boolean push(int val){
        if(isFull()) {
            System.out.println("stack overflow!");
            return false;
        }
        stack[++index] = val;

        return true;
    }
    public int pop(){
        if(isEmpty()) {
            System.out.println("stack underflow!");
            return 0;
        }
        int val = stack[index];
        stack[index--] = 0;

        return val;
    }
    public int peek() {
        if (isEmpty()) {
            System.out.println("stack is empty!");
            return -1;
        }
        return stack[index];
    }

    public boolean isEmpty(){
        return index == -1;
    }
    public boolean isFull(){
        return index == stack.length - 1;
    }

    public void printStack(){
        for(int item : stack){
            System.out.print(item+" ");
        }
    }
}

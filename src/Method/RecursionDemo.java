package Method;

public class RecursionDemo {
    public static void main(String[] args) {
        RecursionDemo recursionDemo = new RecursionDemo();
        System.out.println("Sum of n terms: "+recursionDemo.addition(10));
    }
    public int addition(int n){
        if(n <= 0){
            return 0;
        }
        return n + addition(n-1);
    }
}

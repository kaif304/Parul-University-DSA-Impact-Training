package SwapNumbers;

public class SwapWithDivide {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Initially: a = "+a+" b = "+b);
        a = a * b;
        b = a / b;
        a = a / b;
        System.out.println("Swapped: a = "+a+" b = "+b);
    }
}

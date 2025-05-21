package SwapNumbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 5, b = 10;
        System.out.println("Initially: a = "+a+" b = "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Swapped: a = "+a+" b = "+b);
    }
}

package WrapperClass;

public class WrapperClassDemo {
    public static void main(String[] args) {
        int number = 10;

        // Integer intWrapperObj = new Integer(number); // deprecated

        Integer intWrapperObj = number;

        System.out.println("Number is : "+intWrapperObj);
    }
}

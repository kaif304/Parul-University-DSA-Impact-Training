package Array;

public class SingleArrayMultipleDataTypes {
    public static void main(String[] args) {
        // an object array can store multiple data types in it
        Object[] data = new Object[3];

        data[0] = 10; // integer value at index 0
        data[1] = "Hello"; // String value at index 1
        data[2] = 3.5; // float value at index 2

        System.out.println(data[0]);
        System.out.println(data[1]);
        System.out.println(data[2]);

        // to use data we need to typecast the values to their respective data type
        System.out.println((int) data[0] * 2);
    }
}

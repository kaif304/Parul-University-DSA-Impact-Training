package OOPs;

public class FinalClass {
    public static final class Final{
        int a = 10;
        public void greet(){
            System.out.println("Good Morning!");
        }
    }

    public  static class ChildClass {
        public void print(){
            System.out.println("I am child class");
        }
    }

    public static void main(String[] args) {
        Final finalObj = new Final();
        finalObj.a = 20;

        // this child class is not able to inherit Final class
        ChildClass child = new ChildClass();
        child.print();
    }

}

package Loops;

public class ContinueDemo {
    public static void main(String[] args) {
        for(int day = 1; day <= 7; day++){
            if(day == 7) {
                continue;
            }
            System.out.println("Work Day "+day);
        }
    }
}

package Loops;

public class ForLoop {
    // for loop example
    static void printDaysAndSessions(){
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(int day = 0; day <= 5; day++){
            for(int session = 1; session <= 2; session++){
                System.out.println(days[day]+" session: "+session);
            }
        }
    }
    public static void main(String[] args) {
        // print numbers from 1 to 10
        for (int i = 1; i <= 10; i++) {
            System.out.print(i+" ");
        }

        printDaysAndSessions();
    }
}

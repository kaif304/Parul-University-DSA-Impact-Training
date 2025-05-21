package Loops;

public class ContinueDemoWithSwitch {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        for(int day = 1; day <= 7; day++) {

            if(day == 7) continue;

            switch (day) {
                case 1, 2, 3, 4, 5, 6:
                    System.out.println("Week Day - "+days[day-1]);
                    break;
            }
        }
    }
}

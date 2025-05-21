package Conditional;

import java.util.Scanner;

public class StudentGradeSystem {
    public static void main(String[] args) {
        int percentage;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student marks: ");
        percentage = sc.nextInt();

        sc.close();

        System.out.print("Grade: ");
        if(percentage >= 90) System.out.println("O");
        else if(percentage >= 75) System.out.println("A+");
        else if(percentage >= 60) System.out.println("A");
        else if(percentage > 35) System.out.println("Pass");
        else System.out.println("Fail");
    }
}

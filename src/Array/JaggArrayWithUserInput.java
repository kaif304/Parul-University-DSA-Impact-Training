package Array;

import java.util.Scanner;

public class JaggArrayWithUserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // number of students initialized
        int students;
        System.out.println("Enter number of students: ");
        students = sc.nextInt();

        int[][] jaggArray = new int[students][];

        // how many questions each student attempted

        for(int i = 0; i < jaggArray.length; i++){
            System.out.println("No. of attempted Qs by student "+(i+1)+": ");
            int questionCount = sc.nextInt();
            jaggArray[i] = new int[questionCount];
        }

        // inserting data/marks now
        // or entering marks for each question of each student

        for (int i = 0; i < jaggArray.length; i++) {
            System.out.println("Enter marks of student "+(i+1));
            for (int j = 0; j < jaggArray[i].length; j++) {
                System.out.println("marks for question "+(j+1));
                int marks = sc.nextInt();
                jaggArray[i][j] = marks;
            }
        }

        sc.close();

        System.out.println();
        System.out.println("Student data -> ");

        for(int[] array : jaggArray){
            for(int val : array){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}

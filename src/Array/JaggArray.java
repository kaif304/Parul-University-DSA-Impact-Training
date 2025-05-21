package Array;

public class JaggArray {
    public static void main(String[] args) {
        // number of students initialized
        int[][] jaggArray = new int[5][];

        // how many questions each student attempted
        jaggArray[0] = new int[3];
        jaggArray[1] = new int[5];
        jaggArray[2] = new int[1];
        jaggArray[3] = new int[2];
        jaggArray[4] = new int[2];

        // inserting data/marks now
        // or entering marks for each question of each student

        // student 1 - 3 questions attempted
        jaggArray[0][0] = 48;
        jaggArray[0][1] = 53;
        jaggArray[0][2] = 49;

        // student 2
        jaggArray[1][0] = 20;
        jaggArray[1][1] = 60;
        jaggArray[1][2] = 80;
        jaggArray[1][3] = 90;
        jaggArray[1][4] = 0;

        // student 3
        jaggArray[2][0] = 35;

        // student 4
        jaggArray[3][0] = 40;
        jaggArray[3][1] = 48;

        // student 5
        jaggArray[4][0] = 60;
        jaggArray[4][1] = 70;

        for(int[] array : jaggArray){
            for(int val : array){
                System.out.print(val+" ");
            }
            System.out.println();
        }
    }
}

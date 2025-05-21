package Patterns;

public class EnclinedLine {
    static void printLine(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(j == i)
                    System.out.print("* ");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printLine(4);
    }
}

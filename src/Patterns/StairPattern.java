package Patterns;

public class StairPattern {
    static void printStairLikePattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printStairLikePattern(4);
    }
}

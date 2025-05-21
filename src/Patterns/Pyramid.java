package Patterns;

public class Pyramid {
    static void printPyramidPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n*2; j++){
                if(j >= n - 1 - i && j <= n - 1 + i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printPyramidPattern(10);
    }
}

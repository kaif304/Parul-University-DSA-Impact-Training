package Patterns;

public class UltaPyramid {
    static void printUltaPyramid(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n*2; j++){
                if(j >= i && j <= n-i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printUltaPyramid(10);
    }
}

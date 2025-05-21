package Patterns;

public class EmptyDiamond {
    static void emptyDiamondPattern(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n*2; j++){
                if(j == n - 1 - i)
                    System.out.print("* ");
                else if(j == n - 1 + i)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n*2; j++){
                if(j == i+1)
                    System.out.print("* ");
                else if(j == (n * 2) - i - 2 - 1)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        emptyDiamondPattern(5);
    }
}

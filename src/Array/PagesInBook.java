package Array;

import java.sql.SQLOutput;
import java.util.Scanner;

public class PagesInBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("no. of chapters: ");
        int chapters = sc.nextInt();
        int[][] book = new int[chapters][];

        for (int i = 0; i < book.length; i++) {
            System.out.println("chapter "+(i+1)+" modules: ");
            int modules = sc.nextInt();
            book[i] = new int[modules];
        }

        for (int i = 0; i < book.length; i++) {
            System.out.println("chapter "+(i+1));
            for (int j = 0; j < book[i].length; j++) {
                System.out.println("module "+(j+1)+" no. of pages: ");
                int pages = sc.nextInt();
                book[i][j] = pages;
            }
        }
        sc.close();

        // total pages
        int sum = 0;
        for(int[] module:book){
            for(int pages:module){
                sum += pages;
            }
        }

        System.out.println("Total pages: "+sum);
    }
}

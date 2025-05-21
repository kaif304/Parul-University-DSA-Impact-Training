package Conditional;

import java.util.Scanner;

public class Matrimonial {
    public static void main(String[] args) {
        String gender;
        int age;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter gender - M/F: ");
        gender = sc.next();

        System.out.println("Enter age: ");
        age = sc.nextInt();

        sc.close();

        if(gender.equals("M") && age >= 21) System.out.println("You can register");
        else if(gender.equals("F") && age >= 18) System.out.println("You can register");
        else System.out.println("You can not register");
    }
}

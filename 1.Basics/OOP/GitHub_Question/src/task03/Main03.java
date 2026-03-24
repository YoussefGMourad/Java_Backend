package task03;

import java.util.Scanner;

public class Main03 {
    public static void main(String[] args) {

        Calculation equ = new Calculation();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number :");
        equ.setNumberone(input.nextFloat());

        System.out.println("Enter the second number :");
        equ.setNumbertwo(input.nextFloat());

        System.out.println("Enter the third number :");
        equ.setNumberthree(input.nextFloat());

        System.out.println("_____________________________________________________");
        equ.printTheSum();
    }
}
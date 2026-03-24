package taskA;

import java.util.Scanner;

public class MainA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("please enter a number");
        int number = input.nextInt() ;
        System.out.println("-------");
        if(number<=0 ) {
            System.out.println("wrong input");
        }else{
        for(int i = 1 ;i <= number;i++){
            System.out.println(i);
        }}
    }
}

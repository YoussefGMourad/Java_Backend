package taskB;

import java.util.Scanner;

public class MainB {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt() ;
        System.out.println("-------");
        if(number<=0 ||number>1000 ) {
            System.out.println("-1");
        }else if (number == 1 ) {
            System.out.println("-1");
        }else
        {
            for(int i = 2  ;i <= number;i+=2){
                System.out.println(i);
            }
        }
    }
}
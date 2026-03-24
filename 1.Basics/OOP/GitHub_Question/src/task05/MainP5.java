package task05;

import java.util.Scanner;

public class MainP5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Player pl1 = new Player();
        System.out.println("Please Enter player ID : ");
        pl1.setId(input.nextInt());

        System.out.println(" ");
        System.out.println("Please Enter player name: ");
        pl1.setName(input.next());
        System.out.println(" ");

        System.out.println("Please Enter player number: ");
        pl1.setNumber(input.nextInt());
        System.out.println(" ");

        System.out.println("Please Enter player phone: ");
        pl1.setPhone(input.next());
        System.out.println(" ");
        System.out.println(" ");
        System.out.println(" ");

        Student std = new Student();
        System.out.println("Please Enter player name: ");
        std.setName(input.next());
        System.out.println(" ");

        System.out.println("Please Enter player age : ");
        std.setAge(input.nextInt());
        System.out.println(" ");

        System.out.println("Please Enter player ID: ");
        std.setId(input.nextInt());
        System.out.println(" ");

        System.out.println("Please Enter player phone: ");
        std.setPhone(input.next());
        System.out.println(" ");

    }
}
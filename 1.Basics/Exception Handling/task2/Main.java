package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        while (true)
        {
            try {
                System.out.println("Please enter number ");
                String Stword = input.next();
                int word = Integer.parseInt(Stword);
                System.out.println(word);
                break;
            } catch (NumberFormatException e) {
                System.out.println("That's not a valid integer!");
            }
        }
    }
}
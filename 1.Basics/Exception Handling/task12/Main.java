package task12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1 , number2 , result;
        try {
            try{
            System.out.println("Enter your  first number");
                number1 = input.nextInt();
            System.out.println("Enter your second number");
            number2 = input.nextInt();
                result =number1 / number2;
                System.out.println(result);

            } catch (ArithmeticException e) {
                System.out.println("Wrong input " + e.getMessage());
            }
        } catch (Exception message) {
            System.out.println(message.getMessage());
        }
    }
}
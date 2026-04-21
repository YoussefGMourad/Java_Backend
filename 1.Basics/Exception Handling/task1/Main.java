package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter first number ");
            int num1 = input.nextInt();
            System.out.println("Please enter second number ");
            int num2 = input.nextInt();
            int result = num1 / num2;
            System.out.println("The result is "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());

        } finally {

            System.out.println("Done. Cleanup happens here.");
        }



    }
}
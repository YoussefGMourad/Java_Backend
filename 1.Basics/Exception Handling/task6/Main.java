package task6;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = null;
        int number1 = 0;
        int number2 = 0;
        try
        {
            System.out.println(name.toUpperCase());

            System.out.println("___________________________");

            System.out.println("Please enter first number ");
             number1 = input.nextInt();
            System.out.println("Please enter second number ");
             number2 = input.nextInt();
            int result = number1 / number2;
            System.out.println("The result is "+result);

        }catch (NullPointerException e){
            System.out.println("Error: text is null "+ e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        }
    }
}
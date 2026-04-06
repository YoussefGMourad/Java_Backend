import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            System.out.println("Please enter two numbers ");
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            double result = (double) num1 / num2;
            System.out.println("The result is "+result);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());

        } finally {

            System.out.println("Done. Cleanup happens here.");
        }



    }
}
package task4;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an index ");
        try{
        int index = input.nextInt();
            System.out.println(numbers[index]);
        }
        catch (InputMismatchException e ){
            System.out.println("That's not a valid integer!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("The index is invalid ....  " + e.getMessage());

        }
    }
}
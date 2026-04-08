package task7;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if(age< 18){
            throw new InvalidAgeException("Age " + age + " is invalid. Must be 18 or older.");
        }else {
            System.out.println("Age is "+ age);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age");
       try
       {
           checkAge(input.nextInt());
       }catch ( InvalidAgeException e){
           System.out.println(e.getMessage());
       }
    }
}
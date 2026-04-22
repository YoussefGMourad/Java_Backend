package service;

import model.Account;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationServiceImplementation implements ApplicationService {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to EraaSoft e-Wallet !");

        int counter = 0;
        boolean isWorking = false;

        while (true) {

            System.out.println("Please choose an option to proceed ");

            System.out.println("1.Login  2.SignUp  3.Exit ");

            try {
                int choice = input.nextInt();

                if (counter < 4) {

                    switch (choice) {

                        case 1:
                            System.out.println("Login feature");
                            System.out.println("");
                            break;

                        case 2:
                            System.out.println("SignUp feature");
                            signup();
                            System.out.println("");
                            break;

                        case 3:
                            System.out.println("Thank you for using EraaSoft e-Wallet...");
                            isWorking = true;

                            break;
                        default:
                            System.out.println("Invalid Choice, Please enter a choice...");
                            System.out.println("");
                            counter++;
                    }

                    if (isWorking) {
                        break;
                    }
                } else {
                    System.out.println("Please try again later..");
                    break;
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Invalid Choice, Please enter a right option...!");

            }

        }
    }

    private AccountService accountService = new AccountServiceImplementation();

    private void signup() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("Please Enter your username");
            String username = input.next();

            System.out.println("Please Enter your password");
            String password = input.next();

            System.out.println("Please Enter your age");
            float age = input.nextFloat();

            System.out.println("Please Enter your phone number");
            String phonenumber = input.next();
            Account account = new Account(username, password, age, phonenumber);
            accountService.createAccount(account);

        } catch (InputMismatchException e) {
            System.err.println("Worng input");
        }


    }

}
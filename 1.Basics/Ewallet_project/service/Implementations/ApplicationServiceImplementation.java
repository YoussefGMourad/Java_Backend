package service.Implementations;

import model.Account;
import service.AccountService;
import service.ApplicationService;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationServiceImplementation implements ApplicationService {

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("╔══════════════════════════════════╗");
        System.out.println("║   Welcome to EraaSoft e-Wallet   ║");
        System.out.println("╚══════════════════════════════════╝");

        int counter = 0;
        boolean isWorking = false;

        while (true) {

            System.out.println("\n── Main Menu ──");
            System.out.println("1. Login");
            System.out.println("2. Sign Up");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");

            try {
                int choice = input.nextInt();

                if (counter < 4) {

                    switch (choice) {

                        case 1:
                            System.out.println("Login feature");
                            login();
                            System.out.println("");
                            break;

                        case 2:
                            System.out.println("SignUp feature");
                            signup();
                            System.out.println("");
                            break;

                        case 3:
                            System.out.println("\nThank you for using EraaSoft e-Wallet. Goodbye!");
                            isWorking = true;

                            break;
                        default:
                            System.out.println("⚠ Invalid option. Please enter 1, 2, or 3.");                            System.out.println("");
                            counter++;
                    }

                    if (isWorking) {
                        break;
                    }
                } else {
                    System.out.println("Too many invalid attempts. Please try again later.");
                    break;
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Invalid input. Please enter a number.");

            }

        }
    }

    private AccountService accountService = new AccountServiceImplementation();

    private void signup() {

        try {
            int choice =0 ;
            Scanner input = new Scanner(System.in);
            System.out.println("\n── Create a New Account ──");

            System.out.println("Please Enter your username");
            String username = input.next();

            System.out.println("Please Enter your password");
            String password = input.next();

            System.out.println("Please Enter your age");
            float age = input.nextFloat();

            System.out.println("Please Enter your phone number");
            String phonenumber = input.next();
            Account account = new Account(username, password, age, phonenumber);
            boolean doesAccoutExist = accountService.createAccount(account);

            if(doesAccoutExist){
                System.out.println("\n✔ Account created successfully! Welcome aboard.");

                System.out.println("\n1. Go to Main Menu");
                System.out.println("2. Back to Start");
                System.out.print("Your choice: ");

                choice = input.nextInt();

                if (choice == 1)  {
                  mainProfile();  // go to the main page

                }
                if(choice == 2){
                    start(); // go back to the start page
                }

            }else {
                System.err.println("✘ Username already taken. Please try a different one.");
                signup();
            }
        } catch (InputMismatchException e) {
            System.err.println("⚠ Invalid input. Please enter the correct format.");
        }


    }

    private void login() {

        try {
            Scanner input = new Scanner(System.in);
            System.out.println("\n── Login to Your Account ──");

            System.out.println("Please Enter your username");
            String username = input.next();
            System.out.println("Please Enter your password");
            String password = input.next();


            Account account = new Account(username,password);


            boolean doesAccoutExist = accountService.doesAccountExistWithUsernameAndPassword(account);
            if(doesAccoutExist){
                mainProfile(); // go to the main page

            }else {
                System.err.println("✘ Incorrect username or password. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.err.println("⚠ Invalid input. Please enter the correct format.");
        }
    }


    private  void mainProfile(){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n╔══════════════════════════╗");
            System.out.println("║       Your Wallet        ║");
            System.out.println("╚══════════════════════════╝");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Logout");
            System.out.print("Your choice: ");

            int choice = input.nextInt();

            switch (choice) {
                case 1:
                    // deposit logic
                    break;
                case 2:
                    // withdraw logic
                    break;
                case 3:
                    System.out.println("\nYou have been logged out. See you next time!");
                    return; // exits mainProfile() → goes back to start() menu
                default:
                    System.out.println("⚠ Invalid option. Please enter 1, 2, or 3.");
            }
        }
    }
}
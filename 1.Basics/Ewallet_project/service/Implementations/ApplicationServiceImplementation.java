package service.Implementations;

import model.Account;
import service.AccountService;
import service.ApplicationService;
import service.ValidationService;

import java.util.InputMismatchException;
import java.util.Objects;
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
    private ValidationService validationService = new ValidationServiceImplementation();

    private void signup() {

        try {
            int choice =0 ;
            Scanner input = new Scanner(System.in);
            System.out.println("\n── Create a New Account ──");


            System.out.println("Please Enter your username");
            String username = input.next();
            while(!validateUsername(username)){
                System.out.println("Username: ");
                username = input.next();
            };


            System.out.println("Please Enter your password");
            String password = input.next();
            while(!validatePassword(password)){
                System.out.println("Please Enter your password");
                password = input.next();
            };



            System.out.println("Please Enter your age");
            int age = input.nextInt();
            while(!validateAge(age)){
                System.out.println("Please Enter your age: ");
                age = input.nextInt();
            };


            System.out.println("Please Enter your phone number");
            String phonenumber = input.next();

            while(!validatePhonenumber(phonenumber)){
                System.out.println("Please Enter your phone number");
                phonenumber = input.next();
            };


            Account account = new Account(username, password, age, phonenumber);
            account = accountService.createAccount(account);

            if (Objects.nonNull(account)) {
                System.out.println("\n✔ Account created successfully! Welcome aboard.");
                System.out.println("\n1. Go to Main Menu");
                System.out.println("2. Back to Start");
                System.out.print("Your choice: ");

                choice = input.nextInt();

                if (choice == 1)  {
                  mainProfile(account);  // go to the main page

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
            while(!validateUsername(username)){
                System.out.println("Username: ");
                username = input.next();
            };


            System.out.println("Please Enter your password");
            String password = input.next();
            while(!validatePhonenumber(password)){
                System.out.println("Please Enter your password");
                password = input.next();
            };


            Account account = new Account(username,password);


            account = accountService.doesAccountExistWithUsernameAndPassword(account);

            if(Objects.nonNull(account)) {
                System.out.println("\nLogin successful!");
                mainProfile(account);
            }else {
                System.err.println("✘ Incorrect username or password. Please try again.");
            }
        } catch (InputMismatchException e) {
            System.err.println("⚠ Invalid input. Please enter the correct format.");
        }
    }

    private boolean validateUsername(String username){
        boolean isUsernameValid = validationService.isUsernameValid(username);

        if(!isUsernameValid){
            System.err.println("Invalid input");
            System.err.println("✘ Username cannot be empty.");
            System.err.println("✘ Username must be at least 3 characters.");
            System.err.println("✘ Username must start with an uppercase letter.");
            System.err.println("✘ Username cannot contain numbers.");
            System.out.println("Please Enter a valid input");
        }
        return isUsernameValid;
    }

    private boolean validatePassword(String password){
        boolean isPasswordValid = validationService.isPasswordValid(password);

        if(!isPasswordValid){
            System.err.println("Invalid input");
            System.err.println("✘ Password cannot be empty.");
            System.err.println("✘ Password must be at least 8 characters.");
            System.err.println("✘ Password cannot start with a number.");
            System.err.println("✘ Password must contain at least one uppercase letter.");
            System.err.println("✘ Password must contain at least one lowercase letter.");
            System.err.println("✘ Password must contain at least one number.");
            System.err.println("Please Enter a valid input");
        }return isPasswordValid;
    }
    private  boolean validateAge(int age){
        boolean isAgeValid = validationService.isAgeValid(age);

        if(!isAgeValid){
            System.err.println("Invalid input");
            System.err.println("✘ You must be at least 18 years old to register.");
            System.err.println("✘ Please enter a valid age.");
            System.err.println("Please Enter a valid input");
        }
        return isAgeValid;
    }
    private boolean validatePhonenumber(String phonenumber){
        boolean isPhonenumberValid = validationService.isPhonenumberValid(phonenumber);

        if(!isPhonenumberValid){
            System.err.println("Invalid input");
            System.err.println("✘ Phone number cannot be empty.");
            System.err.println("✘ Phone number must be exactly 11 digits.");
            System.err.println("✘ Phone number must start with 01.");
            System.err.println("✘ Invalid operator. Must be 010, 011, 012, or 015.");
            System.err.println("✘ Phone number must contain digits only.");
            System.err.println("Please Enter a valid input");

        }
        return isPhonenumberValid;
    }



    private  void mainProfile(Account account){
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("\n╔══════════════════════════╗");
            System.out.println("║       Your Wallet        ║");
            System.out.println("╚══════════════════════════╝");
            System.out.println("[1] Deposit");
            System.out.println("[2] Withdraw");
            System.out.println("[3] Transfer");
            System.out.println("[4] Show Profile Details");
            System.out.println("[5] Change Password");
            System.out.println("[6] Remove Account");
            System.out.println("[7] Logout");
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
                    //
                case 4:
                    showProfileDetails(account);
                    break;
                case 5:
                    // withdraw logic
                    break;
                case 6:
                    // withdraw logic
                    break;
                case 7:
                    System.out.println("\nYou have been logged out. See you next time!");
                    return; // exits mainProfile() → goes back to start() menu
                default:
                    System.out.println("⚠ Invalid option. Please enter 1, 2, 3....");
            }
        }
    }

    private void showProfileDetails(Account account) {
        System.out.println("=================================");
        System.out.println("           Account Data          ");
        System.out.println("=================================\n");

        System.out.println("Username: " + account.getUsername());
        System.out.println("Password: " + account.getPassword());
        System.out.println("Balance: " + account.getBalance());
        System.out.println("Phone Number: " + account.getPhonenumber());
        System.out.println("Age: " + account.getAge());
    }
}
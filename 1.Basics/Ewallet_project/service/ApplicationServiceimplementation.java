package service;
import java.util.Scanner;

public class ApplicationServiceimplementation  implements ApplicationService{

    @Override
    public void start() {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to EraaSoft e-Wallet !");

        int counter = 0;
        boolean isWorking = false;

        while (true) {

            System.out.println("Please chosse an option to proceed ");

            System.out.println("1.Login  2.SignUp  3.Exit ");

            int choice = input.nextInt();

            if (counter < 4) {

                switch (choice) {

                    case 1:
                        System.out.println("Login feature");
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("SignUp feature");
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

        }
    }
}
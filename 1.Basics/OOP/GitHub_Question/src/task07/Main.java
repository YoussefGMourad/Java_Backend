package task07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // ===== Fc task04.Player =====
        System.out.print("Enter Fc task04.Player ID: ");
        int id1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter Fc task04.Player Name: ");
        String name1 = input.nextLine();

        System.out.print("Enter Fc task04.Player Number: ");
        int number1 = input.nextInt();
        input.nextLine();

        System.out.print("Enter Fc Code: ");
        String fcode = input.nextLine();

        ClubFcPlayer fcPlayer =
                new ClubFcPlayer(id1, name1, number1, fcode);

        // ===== Rel task04.Player =====
        System.out.print("\nEnter Rel task04.Player ID: ");
        int id2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter Rel task04.Player Name: ");
        String name2 = input.nextLine();

        System.out.print("Enter Rel task04.Player Number: ");
        int number2 = input.nextInt();
        input.nextLine();

        System.out.print("Enter Rel Code: ");
        String rcode = input.nextLine();

        ClubRelPlayer relPlayer =
                new ClubRelPlayer(id2, name2, number2, rcode);

        // ===== Output =====
        System.out.println("\n--- Output ---");

        // basic info
        fcPlayer.printInfo();
        relPlayer.printInfo();

        input.close();
    }
}
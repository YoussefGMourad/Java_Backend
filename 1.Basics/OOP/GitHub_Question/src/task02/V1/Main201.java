package task02.V1;

import java.util.Scanner;

public class Main201 {
    public static void main(String[] args) {


        Player player= new Player();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the player name :");


        player.setPlayerName(input.next());
        System.out.println("Please enter the player number :");
        player.setPlayerNumber(input.nextInt());

        player.printPlayerInfo();
    }
}
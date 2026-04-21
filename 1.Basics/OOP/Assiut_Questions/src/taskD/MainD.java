package taskD;

import java.util.Scanner;

public class MainD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers");
        while (sc.hasNextInt()) {
            int x = sc.nextInt();
            if (x == 1999) {
                System.out.println("Correct");
                return;
            }
            System.out.println("Wrong");
        }
    }
}


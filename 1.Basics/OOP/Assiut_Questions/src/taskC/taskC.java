package src.taskC;

import java.util.Scanner;

public class taskC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter some numbers");
        int n = sc.nextInt();
        int even = 0, odd = 0, positive = 0, negative = 0;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x % 2 == 0) even++;
            else odd++;
            if (x > 0) positive++;
            else if (x < 0) negative++;
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
        System.out.println("Positive: " + positive);
        System.out.println("Negative: " + negative);
    }
}
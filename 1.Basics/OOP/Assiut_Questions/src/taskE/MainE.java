package src.taskE;

import java.util.Scanner;

public class MainE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            if (x > max) max = x;
        }

        System.out.println(max);
    }
}
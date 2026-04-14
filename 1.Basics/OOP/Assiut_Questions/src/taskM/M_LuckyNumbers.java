import java.util.Scanner;

public class M_LuckyNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int i = a; i <= b; i++) {
            if (isLucky(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    static boolean isLucky(int n) {
        while (n > 0) {
            int digit = n % 10;
            if (digit != 4 && digit != 7) return false;
            n /= 10;
        }
        return true;
    }
}

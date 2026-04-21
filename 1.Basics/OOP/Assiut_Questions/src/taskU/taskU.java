import java.util.Scanner;

public class taskU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int total = 0;

        for (int i = 1; i <= n; i++) {
            int digitSum = getDigitSum(i);
            if (digitSum >= a && digitSum <= b) {
                total += i;
            }
        }

        System.out.println(total);
    }

    static int getDigitSum(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

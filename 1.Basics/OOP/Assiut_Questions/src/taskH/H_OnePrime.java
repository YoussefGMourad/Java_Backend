import java.util.Scanner;

public class H_OnePrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        if (isPrime(x)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

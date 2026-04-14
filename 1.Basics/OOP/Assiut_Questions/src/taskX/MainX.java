import java.util.Scanner;

public class MainX {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            int ones = Long.bitCount(n);
            long result = (long) Math.pow(2, ones) - 1;
            System.out.println(result);
        }
    }
}

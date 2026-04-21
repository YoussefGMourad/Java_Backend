import java.util.Scanner;

public class taskS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int start = Math.min(x, y) + 1;
            int end = Math.max(x, y) - 1;
            int sum = 0;

            for (int i = start; i <= end; i++) {
                if (i % 2 != 0) sum += i;
            }

            System.out.println(sum);
        }
    }
}

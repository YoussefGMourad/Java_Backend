import java.util.Scanner;

public class R_SequenceAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            if (n <= 0 || m <= 0) break;

            int start = Math.min(n, m);
            int end = Math.max(n, m);
            int sum = 0;
            StringBuilder sb = new StringBuilder();

            for (int i = start; i <= end; i++) {
                sb.append(i).append(" ");
                sum += i;
            }

            System.out.println(sb + "sum =" + sum);
        }
    }
}

import java.util.Scanner;

public class taskQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            String n = sc.next();
            StringBuilder sb = new StringBuilder();
            for (int i = n.length() - 1; i >= 0; i--) {
                sb.append(n.charAt(i));
                if (i != 0) sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}

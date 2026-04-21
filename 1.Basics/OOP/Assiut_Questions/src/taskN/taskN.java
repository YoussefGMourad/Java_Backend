import java.util.Scanner;

public class taskN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int count = sc.nextInt();
            for (int j = 0; j < count; j++) {
                System.out.print(s);
            }
            System.out.println();
        }
    }
}

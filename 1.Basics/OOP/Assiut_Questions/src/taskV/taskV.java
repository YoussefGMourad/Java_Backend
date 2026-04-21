import java.util.Scanner;

public class taskV {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int current = 1;

        for (int i = 0; i < n; i++) {
            System.out.println(current + " " + (current + 1) + " " + (current + 2) + " PUM");
            current += 4;
        }
    }
}

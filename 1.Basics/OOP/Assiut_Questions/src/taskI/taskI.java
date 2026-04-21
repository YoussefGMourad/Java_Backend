import java.util.Scanner;

public class taskI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n = sc.next();

        String reversed = new StringBuilder(n).reverse().toString();
        String reversedNoLeadingZeros = String.valueOf(Integer.parseInt(reversed));

        System.out.println(reversedNoLeadingZeros);

        if (n.equals(reversedNoLeadingZeros)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

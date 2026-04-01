package taskC;
import java.util.Scanner;

public class MainC {
    public static int[] check() {
        Scanner input = new Scanner(System.in);
        System.out.println("How number you want to enter");
        int n = input.nextInt(); // read number of elements
        int[] numbers = new int[n];

        int evenCount = 0;
        int oddCount = 0;
        int positiveCount = 0;
        int negativeCount = 0;
        System.out.println("Enter "+ n +" numbers");
        for (int i = 0; i < n; i++) {
            numbers[i] = input.nextInt();

            // Count even/odd
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }

            // Count positive/negative (0 is ignored)
            if (numbers[i] > 0) {
                positiveCount++;
            } else if (numbers[i] < 0) {
                negativeCount++;
            }
        }

        System.out.println("Even: " + evenCount);
        System.out.println("Odd: " + oddCount);
        System.out.println("Positive: " + positiveCount);
        System.out.println("Negative: " + negativeCount);

        return numbers;
    }

    public static void main(String[] args) {
        check();
    }
}

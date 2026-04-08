package task9;

public class Main {
    public static void debit(int amount , int balance ){
        if (amount > balance){
            throw new ArithmeticException("Insufficient funds");

        }else {
            System.out.println("Debited: " + amount);
        }
    }
    public static void withdraw (int amount, int balance) throws ArithmeticException {
        System.out.println("Processing withdrawal...");
        debit(amount, balance);
    }
    public static void main(String[] args) {
        try {
            withdraw(100, 500); // balance=100, trying to take 500
        } catch (ArithmeticException e) {
            System.out.println("Transaction failed: " + e.getMessage());
        }
    }
}
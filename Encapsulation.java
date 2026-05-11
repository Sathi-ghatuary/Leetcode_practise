class BankAccount {

    private double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        BankAccount acc = new BankAccount();

        acc.deposit(5000);

        System.out.println(acc.getBalance());
    }
}
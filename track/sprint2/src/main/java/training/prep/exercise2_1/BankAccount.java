package training.prep.exercise2_1;

/**
 * ✍️Exercise 2.1 - Fix the direct balance access using encapsulation
 */
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

class BankService {
    void withdraw(BankAccount account, double amount) {
        account.setBalance(account.getBalance() - amount);
    }

    void deposit(BankAccount account, double amount) {
        account.setBalance(account.getBalance() + amount);
    }
}

class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        BankService service = new BankService();
        service.withdraw(account, 150);
        System.out.println("Balance: " + account.getBalance());
        service.deposit(account, 200);
        System.out.println("New Balance: " + account.getBalance());
    }
}
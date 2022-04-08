public class Account {
    private double balance;
    public Account(double balance) {
        this.balance = balance;
    }
    public double withdraw(double amount)
    {
        return balance - amount;
    }
}

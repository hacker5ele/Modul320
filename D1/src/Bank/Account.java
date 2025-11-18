package Bank;

public class Account {

    private String accountNumber;
    private String owner;
    private double balance;
    private String currency;

    public Account(String accountNumber, String owner, double balance, String currency) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balance = balance;
        this.currency = currency;
    }

    public void addBalance(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if((this.balance - amount) < 0) {
            System.out.println("Insufficient funds!");
        } else  {
            this.balance = balance - amount;
        }
    }

    public void transfer(Account accountToTransfer, double amount) {
        if (amount < 0) {
            System.out.println("Cannot transfer negative amount!");
            return;
        }
        if (this.balance < amount) {
            System.out.println("Insufficient funds!");
            return;
        }
1
        this.withdraw(amount);
        accountToTransfer.addBalance(amount);
        System.out.println("Transferred " + amount + " " + currency + " to " + accountToTransfer.getOwner());
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCurrency() {
        return currency;
    }

    public String getOwner() {
        return owner;
    }
}

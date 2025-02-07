package fintech.model;

/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Account {
    private String owner, accountName;
    private double balance;

    // class definition
    public Account(String _owner, String _accountName) {
        this.owner = _owner;
        this.accountName = _accountName;
        this.balance = 0.0;
    }

    public void deposit(double _amount) {
        this.balance += _amount;
    }

    public String getOwner() {
        return owner;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public void addTransaction(double _amount) {
        balance += _amount;
    }

    @Override
    public String toString() {
        return accountName + '|' + owner + '|' + balance;
    }

}
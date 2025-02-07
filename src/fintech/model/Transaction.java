package fintech.model;
/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Transaction {
    private static int idCounter = 0;
    private int id;
    private double amount;
    private String postedAt;
    private String note;
    private Account account;

    public Transaction(double amount, String postedAt, String note, Account account) {
        this.id = ++idCounter;
        this.amount = amount;
        this.postedAt = postedAt;
        this.note = note;
        this.account = account;
        account.addTransaction(amount);
    }

    public int getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public String getPostedAt() {
        return postedAt;
    }

    public String getNote() {
        return note;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return id + "|" + account.getAccountName() + '|' + amount + '|' + postedAt + '|' + note + '|' + account.getBalance();
    }
}
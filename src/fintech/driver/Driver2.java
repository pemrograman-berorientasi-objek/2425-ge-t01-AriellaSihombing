package fintech.driver;

import java.util.Scanner;
import fintech.model.Account;
import fintech.model.Transaction;
/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Driver2 {
    private static Account account;

    public static void main(String[] _args) {
        Scanner scanner = new Scanner(System.in);

        // Read input
        String command = scanner.nextLine();

        // Create account
        if (command.equals("create-account")) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();
            account = new Account(owner, accountName);
            System.out.println(account.toString());
        } else {
            System.out.println("Invalid command");
            scanner.close();
            return;
        }

        // Read next command
        String komen = scanner.nextLine();
        if (komen.equals("create-transaction")) {
            String accountName = scanner.nextLine();
            double amount = Double.parseDouble(scanner.nextLine());
            String postedAt = scanner.nextLine();
            String note = scanner.nextLine();

            if (account != null && account.getAccountName().equals(accountName)) {
                Transaction transaction = new Transaction(amount, postedAt, note, account);
                System.out.println(transaction.toString());
            } else {
                System.out.println("Akun mu tidak terdeteksi: " + accountName);
            }
        } else {
            System.out.println("Invalid command");
        }

        scanner.close();
    }
}
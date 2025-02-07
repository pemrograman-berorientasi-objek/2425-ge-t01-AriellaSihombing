package fintech.driver;

import fintech.model.Account;
import java.util.Scanner;

/**
 * @author 12S23005 Ariella Sihombing
 * @author 12S23035 Julius Sinaga
 */
public class Driver1 {

    public static void main(String[] _args) {
        // codes
        Scanner scanner = new Scanner(System.in);
        // Read input
        String command = scanner.nextLine();
        
        // Create account
        if (command.equals("create-account")) {
            String owner = scanner.nextLine();
            String accountName = scanner.nextLine();
            Account account = new Account(owner, accountName);
            System.out.println(account.toString());
        } else {
            System.out.println("Invalid command");
        }

        scanner.close();
    }

}
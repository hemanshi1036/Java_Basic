import java.util.*;

class Account {
    private String accountId;
    private String name;
    private double balance;

    public Account(String accountId, String name, double balance) {
        this.accountId = accountId;
        this.name = name;
        this.balance = balance;
    }

    public void displayDetails() {
        System.out.println("Account ID: " + accountId);
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }
    public static Account searchAccount(Account[] accounts, String accountId) {
        for (Account acc : accounts) {
            if (acc.accountId.equals(accountId)) {
                return acc;
            }
        }
        return null;
    }
}
public class AccountMaker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAccounts = 5;
        Account[] accounts = new Account[numAccounts];

        for (int i = 0; i < numAccounts; i++) {
            System.out.println("Enter details for account " + (i + 1) + ":");
            System.out.print("Account ID: ");
            String accountId = scanner.nextLine();
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine();
            accounts[i] = new Account(accountId, name, balance);
        }
        System.out.println("\nDetails of all accounts:");
        for (Account account : accounts) {
            account.displayDetails();
            System.out.println();
        }
        System.out.print("\nEnter Account ID to search: ");
        String searchId = scanner.nextLine();
        Account foundAccount = Account.searchAccount(accounts, searchId);
        if (foundAccount != null) {
            System.out.println("\nAccount found. Details are:");
            foundAccount.displayDetails();
        } else {
            System.out.println("\nAccount not found.");
        }
    }
    
}

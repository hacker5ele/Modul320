package Bank;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Account account;

        Account a1 = new Account("111-23-34", "John", 223, "CHF");
        Account a2 = new Account("235-65-45", "Alice", 456, "EUR");

        System.out.println("WELCOME!");
        System.out.println("Please enter your account number: ");

        String accountNumber = scanner.nextLine();

        if (Objects.equals(a1.getAccountNumber(), accountNumber)) {
            account = a1;
        } else if (Objects.equals(a2.getAccountNumber(), accountNumber)) {
            account = a2;
        } else {
            System.out.println("Account not found!");
            return;
        }

        System.out.println("Welcome: " + account.getOwner());
        System.out.println("Your balance is: " + account.getBalance());

        int choice;

        while(true) {

            System.out.println("What would you like to do?");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Transfer");
            System.out.println("4. Exit");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter amount to be deposited: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    account.addBalance(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to be withdrawn: ");
                    double amount2 = scanner.nextDouble();
                    scanner.nextLine();
                    account.withdraw(amount2);
                    break;
                case 3:
                    System.out.println("Enter amount to be transferred: ");
                    double amount3 = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.println("Enter account number to transfer money to: ");
                    String accountNumber2 = scanner.nextLine();

                    Account targetAccount = null;
                    if (Objects.equals(a1.getAccountNumber(), accountNumber2)) {
                        targetAccount = a1;
                    } else if (Objects.equals(a2.getAccountNumber(), accountNumber2)) {
                        targetAccount = a2;
                    } else {
                        System.out.println("Target account not found!");
                        break;
                    }

                    account.transfer(targetAccount, amount3);
                    break;

                case 4:
                    return;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }


    }
}
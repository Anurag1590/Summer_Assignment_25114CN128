// Code to create bank account management system.
import java.util.*;
public class Question_110 {

    static class BankAccount {
        int accNo;
        String name;
        double balance;

        public BankAccount(int accNo, String name, double balance) {
            this.accNo = accNo;
            this.name = name;
            this.balance = balance;
        }

        public void display() {
            System.out.println("Account No: " + accNo + ", Name: " + name + ", Balance: " + balance);
        }
    }

    static ArrayList<BankAccount> accounts = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void createAccount() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double balance = sc.nextDouble();

        accounts.add(new BankAccount(accNo, name, balance));
        System.out.println("Account created successfully!\n");
    }

    public static void viewAccounts() {
        if (accounts.isEmpty()) {
            System.out.println("No accounts found.\n");
            return;
        }

        for (BankAccount a : accounts) {
            a.display();
        }
        System.out.println();
    }

    public static void searchAccount() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();

        for (BankAccount a : accounts) {
            if (a.accNo == accNo) {
                System.out.println("Account found:");
                a.display();
                return;
            }
        }

        System.out.println("Account not found.\n");
    }

    public static void deposit() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Amount to Deposit: ");
        double amt = sc.nextDouble();

        for (BankAccount a : accounts) {
            if (a.accNo == accNo) {
                a.balance += amt;
                System.out.println("Amount deposited successfully!\n");
                return;
            }
        }

        System.out.println("Account not found.\n");
    }

    public static void withdraw() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();

        System.out.print("Enter Amount to Withdraw: ");
        double amt = sc.nextDouble();

        for (BankAccount a : accounts) {
            if (a.accNo == accNo) {
                if (a.balance >= amt) {
                    a.balance -= amt;
                    System.out.println("Amount withdrawn successfully!\n");
                } else {
                    System.out.println("Insufficient balance!\n");
                }
                return;
            }
        }

        System.out.println("Account not found.\n");
    }

    public static void menu() {
        while (true) {
            System.out.println("===== Bank Account System =====");
            System.out.println("1. Create Account");
            System.out.println("2. View Accounts");
            System.out.println("3. Search Account");
            System.out.println("4. Deposit Money");
            System.out.println("5. Withdraw Money");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> createAccount();
                case 2 -> viewAccounts();
                case 3 -> searchAccount();
                case 4 -> deposit();
                case 5 -> withdraw();
                case 6 -> {
                    System.out.println("Exiting...");
                    return;
                }
                default -> System.out.println("Invalid choice!\n");
            }
        }
    }

    public static void main(String[] args) {
        menu();
    }
}


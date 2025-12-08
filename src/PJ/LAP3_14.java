package PJ;

import java.util.Scanner;

class BankAccountttttttttt {
    private double balance;
    private static int totalTransactionCount = 0;

    public BankAccountttttttttt(double initialDeposit) {
        if (initialDeposit >= 0) {
            balance = initialDeposit;
        } else {
            balance = 0;
        }
        System.out.println("Account created.");
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalTransactionCount++;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                totalTransactionCount++;
                System.out.println("Withdrawal successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public static int getTotalTransactionCount() {
        return totalTransactionCount;
    }
}

public class LAP3_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccountttttttttt accountInstance = null;

        int N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine().trim();

            switch (command.toUpperCase()) {
                case "CREATE":
                    double initialDeposit = Double.parseDouble(sc.nextLine().trim());
                    accountInstance = new BankAccountttttttttt(initialDeposit);
                    break;

                case "DEPOSIT":
                    double depositAmount = Double.parseDouble(sc.nextLine().trim());
                    if (accountInstance == null) {
                        System.out.println("No account exists.");
                    } else {
                        accountInstance.deposit(depositAmount);
                    }
                    break;

                case "WITHDRAW":
                    double withdrawAmount = Double.parseDouble(sc.nextLine().trim());
                    if (accountInstance == null) {
                        System.out.println("No account exists.");
                    } else {
                        accountInstance.withdraw(withdrawAmount);
                    }
                    break;

                case "STATUS":
                    if (accountInstance == null) {
                        System.out.println("No account exists.");
                    } else {
                        System.out.printf("Balance: %.2f%n", accountInstance.getBalance());
                    }
                    break;

                case "GLOBAL_STATUS":
                    System.out.println("Total Transactions: " + BankAccountttttttttt.getTotalTransactionCount());
                    break;
            }
        }

        sc.close();
    }
}

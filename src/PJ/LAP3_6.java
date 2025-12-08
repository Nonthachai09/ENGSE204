package PJ;

import java.util.Scanner;

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0;
        }
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

public class LAP3_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double initial = sc.nextDouble();
        double dep = sc.nextDouble();
        double wd = sc.nextDouble();

        BankAccount acc = new BankAccount(initial);

        acc.deposit(dep);
        acc.withdraw(wd);

        System.out.println("Final Balance: " + acc.getBalance());
    }
}

package PJ;

import java.util.Scanner;

class BankAccount {
    String ownerName;
    double balance;

    public BankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displaySummary() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Balance: " + balance);
    }
}

public class LAp2_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ownerName = sc.nextLine();
        double initialBalance = Double.parseDouble(sc.nextLine());
        double depositAmount = Double.parseDouble(sc.nextLine());

        BankAccount account = new BankAccount(ownerName, initialBalance);
        account.deposit(depositAmount);
        account.displaySummary();
    }
}

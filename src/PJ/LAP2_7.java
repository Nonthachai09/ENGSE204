package PJ;

import java.util.Scanner;

class MyBankAccount {
    String ownerName;
    double balance;

    public MyBankAccount(String ownerName, double initialBalance) {
        this.ownerName = ownerName;
        this.balance = initialBalance;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void displayBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class LAP2_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String ownerName = sc.nextLine();
        double initialBalance = Double.parseDouble(sc.nextLine());
        double withdrawAmount1 = Double.parseDouble(sc.nextLine());
        double withdrawAmount2 = Double.parseDouble(sc.nextLine());

        MyBankAccount account = new MyBankAccount(ownerName, initialBalance);
        account.withdraw(withdrawAmount1);
        account.withdraw(withdrawAmount2);
        account.displayBalance();
    }
}

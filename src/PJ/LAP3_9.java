package PJ;

import java.util.Scanner;

class Account {

    private String userName;
    private String userPassword;

    private static int minPassLength = 8;

    public Account(String userName, String userPassword) {
        this.userName = userName;
        if (userPassword.length() >= minPassLength) {
            this.userPassword = userPassword;
            System.out.println("Creation successful");
        } else {
            this.userPassword = "invalid";
            System.out.println("Creation failed");
        }
    }

    public String getPassword() {
        return userPassword;
    }

    public void setPassword(String newPassword) {
        if (newPassword.length() >= minPassLength) {
            this.userPassword = newPassword;
            System.out.println("Update successful");
        } else {
            System.out.println("Update failed");
        }
    }

    public static void setMinLength(int length) {
        if (length < 4) {
            System.out.println("Invalid length.");
        } else {
            minPassLength = length;
            System.out.println("Now min length set to " + length);
        }
    }

    public static int getMinLength() {
        return minPassLength;
    }
}

public class LAP3_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int minLength1 = Integer.parseInt(sc.nextLine().trim());
        String account1Name = sc.nextLine().trim();
        String account1Pass = sc.nextLine().trim();
        String account2Name = sc.nextLine().trim();
        String account2Pass = sc.nextLine().trim();
        int minLength2 = Integer.parseInt(sc.nextLine().trim());
        String account2NewPass = sc.nextLine().trim();

        Account.setMinLength(minLength1);

        Account account1 = new Account(account1Name, account1Pass);
        Account account2 = new Account(account2Name, account2Pass);

        Account.setMinLength(minLength2);

        account2.setPassword(account2NewPass);

        System.out.println(account1.getPassword());
        System.out.println(account2.getPassword());
    }
}

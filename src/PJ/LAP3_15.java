package PJ;

import java.util.Scanner;

class SystemUser {
    private String username;
    private int failedAttempts;
    private boolean isLocked;

    private static int maxAttempts = 3; 

    public SystemUser(String username) {
        this.username = username;
        this.failedAttempts = 0;
        this.isLocked = false;
    }

    public static void setPolicy(int max) {
        if (max > 0) {
            maxAttempts = max;
            System.out.println("Policy updated.");
        } else {
            System.out.println("Invalid policy.");
        }
    }

    public String getUsername() {
        return username;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public int getFailedAttempts() {
        return failedAttempts;
    }

    public void login(String password) {
        if (isLocked) {
            System.out.println("Account is locked.");
            return;
        }

        if (password.equals("pass123")) { 
            failedAttempts = 0;
            System.out.println("Login successful.");
        } else { 
            failedAttempts++;
            if (failedAttempts >= maxAttempts) {
                isLocked = true;
                System.out.println("Login failed. Account locked.");
            } else {
                int attemptsLeft = maxAttempts - failedAttempts;
                System.out.println("Login failed. " + attemptsLeft + " attempts left.");
            }
        }
    }
}

public class LAP3_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // create user
        String username = sc.nextLine().trim();
        SystemUser user = new SystemUser(username);

        int N = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < N; i++) {
            String command = sc.nextLine().trim();

            switch (command.toUpperCase()) {
                case "SET POLICY":
                case "SET_POLICY": 
                    int newMax = Integer.parseInt(sc.nextLine().trim());
                    SystemUser.setPolicy(newMax);
                    break;

                case "LOGIN":
                    String password = sc.nextLine().trim();
                    user.login(password);
                    break;

                default:
                    System.out.println("Unknown command.");
            }
        }

        sc.close();
    }
}

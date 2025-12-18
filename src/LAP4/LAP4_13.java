package LAP4;

import java.util.Scanner;

final class Subscription {
    private final String planName;
    private final int durationDays;

    private static int maxDuration = 365;

    public Subscription(String planName, int durationDays) {
        this.planName = planName;
        if (durationDays < 0) {
            this.durationDays = 0;
        } else if (durationDays > maxDuration) {
            this.durationDays = maxDuration;
        } else {
            this.durationDays = durationDays;
        }
    }

    public Subscription(Subscription other) {
        this.planName = other.planName;
        this.durationDays = other.durationDays;
    }

    public static void setMaxDuration(int max) {
        if (max > 0) {
            maxDuration = max;
            System.out.print("Max duration set to " + max + " ");
        } else {
            System.out.print("Invalid max policy. ");
        }
    }

    public Subscription extend(int days) {
        if (days <= 0) {
            System.out.print("Invalid extension days. ");
            return this;
        }

        int newDays = this.durationDays + days;
        if (newDays > maxDuration) {
            System.out.print("Extension failed: Exceeds max policy. ");
            return this;
        }

        System.out.print("Extension successful. ");
        return new Subscription(planName, newDays);
    }

    public void displayInfo() {
        System.out.print("Plan: " + planName + ", Days: " + durationDays);
    }
}

public class LAP4_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int max = sc.nextInt();
        Subscription.setMaxDuration(max);

        String planName = sc.next();
        int initialDays = sc.nextInt();

        Subscription sub = new Subscription(planName, initialDays);

        while (sc.hasNextInt()) {
            int ext = sc.nextInt();
            sub = sub.extend(ext);
        }

        sub.displayInfo();
    }
}
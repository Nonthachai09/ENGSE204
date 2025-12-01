package PJ;

import java.util.Scanner;

class Learner {
    String name;
    int midtermScore;
    int finalScore;

    public Learner(String name, int midtermScore, int finalScore) {
        this.name = name;
        this.midtermScore = midtermScore;
        this.finalScore = finalScore;
    }

    public double calculateAverage() {
        return (midtermScore + finalScore) / 2.0;
    }

    public void displaySummary() {
        System.out.println("Name: " + name);
        System.out.println("Average Score: " + calculateAverage());
        if (calculateAverage() >= 50.0) {
            System.out.println("Status: Pass");
        } else {
            System.out.println("Status: Fail");
        }
    }
}

public class LAP2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        int midtermScore = sc.nextInt();
        int finalScore = sc.nextInt();

        Learner learner = new Learner(name, midtermScore, finalScore);
        learner.displaySummary();

        sc.close();
    }
}

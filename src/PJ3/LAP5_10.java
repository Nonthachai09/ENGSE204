package PJ3;

import java.util.Scanner;

class ProjectTask {
    protected String description;
    protected int baseHours;

    public ProjectTask(String desc, int hours) {
        description = desc;
        baseHours = hours;
    }

    public double calculateCost() {
        return baseHours * 50.0;
    }
}

class ComplexTask extends ProjectTask {
    protected double setupFee;

    public ComplexTask(String cDesc, int cHours, double cFee) {
        super(cDesc, cHours);
        setupFee = cFee;
    }

    @Override
    public double calculateCost() {
        return (super.calculateCost() * 1.10) + setupFee;
    }
}

class SimpleTask extends ProjectTask {

    public SimpleTask(String sDesc, int sHours) {
        super(sDesc, sHours);
    }

    @Override
    public double calculateCost() {
        return super.calculateCost();
    }
}

public class LAP5_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String complexDesc = sc.nextLine();
        int complexHours = sc.nextInt();
        double complexFee = sc.nextDouble();
        sc.nextLine();

        String simpleDesc = sc.nextLine();
        int simpleHours = sc.nextInt();

        ProjectTask task1 = new ComplexTask(complexDesc, complexHours, complexFee);
        ProjectTask task2 = new SimpleTask(simpleDesc, simpleHours);

        ProjectTask[] tasks = {task1, task2};

        for (ProjectTask t : tasks) {
            System.out.println(t.calculateCost());
        }
    }
}

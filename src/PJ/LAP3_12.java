package PJ;

import java.util.Scanner;

class Employeeeee {
    private String name;
    private double monthlySalary;

    public Employeeeee(String name, double monthlySalary) {
        this.name = name;
        if (monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        } else {
            this.monthlySalary = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void giveRaise(double amount) {
        if (amount > 0) {
            monthlySalary += amount;
            System.out.println("Raise applied.");
        } else {
            System.out.println("Invalid amount.");
        }
    }

    private double getAnnualSalary() {
        return monthlySalary * 12;
    }

    public double calculateTax(double taxRate) {
        return getAnnualSalary() * taxRate;
    }
}

public class LAP3_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine().trim();
        double monthlySalary = Double.parseDouble(sc.nextLine().trim());
        double taxRate = Double.parseDouble(sc.nextLine().trim());
        double raiseAmount = Double.parseDouble(sc.nextLine().trim());

        Employeeeee emp = new Employeeeee(name, monthlySalary);

        System.out.printf("Tax (Before): %.2f%n", emp.calculateTax(taxRate));

        emp.giveRaise(raiseAmount);

        System.out.printf("Tax (After): %.2f%n", emp.calculateTax(taxRate));

        sc.close();
    }
}

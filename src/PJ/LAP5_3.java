package PJ;

import java.util.Scanner;

import PJ.Employee;
import PJ.Manager;

class Employee {
    protected double salary;

    public double calculateBonus() {
        return salary * 0.10;
    }
}

class Manager extends Employee {
    @Override
    public double calculateBonus() {
        return super.calculateBonus() + (salary * 0.05);
    }
}

public class LAP5_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double salary = sc.nextDouble();

        Manager manager = new Manager();
        manager.salary = salary;

        System.out.println(manager.calculateBonus());
    }
}
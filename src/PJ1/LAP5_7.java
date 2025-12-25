package PJ1;

import java.util.Scanner;

class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String empName, double empBaseSalary) {
        name = empName;
        baseSalary = empBaseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }
}

class SalesEmployee extends Employee {
    protected double commissionRate;

    public SalesEmployee(String sName, double sSalary, double sRate) {
        super(sName, sSalary);
        commissionRate = sRate;
    }

    @Override
    public double calculatePay() {
        return baseSalary + (baseSalary * commissionRate);
    }
}

class Manager extends Employee {
    protected double fixedBonus;

    public Manager(String mName, double mSalary, double mBonus) {
        super(mName, mSalary);
        fixedBonus = mBonus;
    }

    @Override
    public double calculatePay() {
        return baseSalary + fixedBonus;
    }
}

class PayrollProcessor {
    public static void process(Employee emp) {
        System.out.println(emp.name + " total pay: " + emp.calculatePay());
    }
}

public class LAP5_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String sEmpName = sc.nextLine();
        double sEmpSalary = sc.nextDouble();
        double sEmpRate = sc.nextDouble();
        sc.nextLine();

        String mEmpName = sc.nextLine();
        double mEmpSalary = sc.nextDouble();
        double mEmpBonus = sc.nextDouble();

        SalesEmployee salesEmp = new SalesEmployee(sEmpName, sEmpSalary, sEmpRate);
        Manager managerEmp = new Manager(mEmpName, mEmpSalary, mEmpBonus);

        PayrollProcessor.process(salesEmp);
        PayrollProcessor.process(managerEmp);
    }
}

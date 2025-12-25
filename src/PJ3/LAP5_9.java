package PJ3;

import java.util.Scanner;

class Item {
    protected String name;

    public Item(String itemName) {
        name = itemName;
    }

    public double getValue() {
        return 0.0;
    }
}

class PhysicalProduct extends Item {
    protected double unitPrice;
    protected int quantity;

    public PhysicalProduct(String pName, double pUnitPrice, int pQuantity) {
        super(pName);
        unitPrice = pUnitPrice;
        quantity = pQuantity;
    }

    @Override
    public double getValue() {
        return unitPrice * quantity;
    }
}

class DigitalSubscription extends Item {
    protected double monthlyCost;
    protected int months;

    public DigitalSubscription(String dName, double dMonthlyCost, int dMonths) {
        super(dName);
        monthlyCost = dMonthlyCost;
        months = dMonths;
    }

    @Override
    public double getValue() {
        return monthlyCost * months;
    }
}

public class LAP5_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String physicalName = sc.nextLine();
        double physicalPrice = sc.nextDouble();
        int physicalQty = sc.nextInt();
        sc.nextLine();

        String digitalName = sc.nextLine();
        double digitalCost = sc.nextDouble();
        int digitalMonths = sc.nextInt();

        Item item1 = new PhysicalProduct(physicalName, physicalPrice, physicalQty);
        Item item2 = new DigitalSubscription(digitalName, digitalCost, digitalMonths);

        Item[] items = {item1, item2};

        double totalValue = 0.0;
        for (Item it : items) {
            totalValue += it.getValue();
        }

        System.out.println(totalValue);
    }
}

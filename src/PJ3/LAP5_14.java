package PJ3;

import java.util.Scanner;

class Shipping {
    protected String trackingId;
    protected double baseFee;

    public Shipping(String sId, double sBaseFee) {
        trackingId = sId;
        baseFee = sBaseFee;
    }

    public double calculateTotalFee() {
        return baseFee;
    }
}

class StandardShipping extends Shipping {

    public StandardShipping(String stdId, double stdBaseFee) {
        super(stdId, stdBaseFee);
    }

    @Override
    public double calculateTotalFee() {
        return baseFee * 1.05;
    }
}

class PremiumShipping extends Shipping {
    protected double insuranceFee;

    public PremiumShipping(String preId, double preBaseFee, double preInsuranceFee) {
        super(preId, preBaseFee);
        insuranceFee = preInsuranceFee;
    }

    @Override
    public double calculateTotalFee() {
        return super.calculateTotalFee() + insuranceFee;
    }
}

public class LAP5_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String stdId = sc.nextLine();
        double stdBaseFee = sc.nextDouble();
        sc.nextLine();

        String preId = sc.nextLine();
        double preBaseFee = sc.nextDouble();
        double insuranceFee = sc.nextDouble();

        Shipping s1 = new StandardShipping(stdId, stdBaseFee);
        Shipping s2 = new PremiumShipping(preId, preBaseFee, insuranceFee);

        Shipping[] shippings = {s1, s2};

        for (Shipping s : shippings) {
            System.out.println(s.calculateTotalFee());
        }
    }
}

package PJ3;

import java.util.Scanner;

class RentalVehicle {
    protected String model;
    protected double rentalRate;

    public RentalVehicle(String rModel, double rRate) {
        model = rModel;
        rentalRate = rRate;
    }

    public double calculateFee() {
        return rentalRate;
    }
}

class Car extends RentalVehicle {

    public Car(String cModel, double cRate) {
        super(cModel, cRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate + 100.0;
    }
}

class Motorcycle extends RentalVehicle {

    public Motorcycle(String mModel, double mRate) {
        super(mModel, mRate);
    }

    @Override
    public double calculateFee() {
        return rentalRate * 1.10;
    }
}

public class LAP5_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String carModel = sc.nextLine();
        double carRate = sc.nextDouble();
        sc.nextLine();

        String motoModel = sc.nextLine();
        double motoRate = sc.nextDouble();

        RentalVehicle rv1 = new Car(carModel, carRate);
        RentalVehicle rv2 = new Motorcycle(motoModel, motoRate);

        RentalVehicle[] vehicles = {rv1, rv2};

        double totalFee = 0.0;
        for (RentalVehicle rv : vehicles) {
            totalFee += rv.calculateFee();
        }

        System.out.println("Total Rental Fee: " + totalFee);
    }
}

package PJ;

import java.util.Scanner;

class TempConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }
}

public class LAP2_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String mode = sc.nextLine();
        double temp = Double.parseDouble(sc.nextLine());

        if (mode.equals("C_TO_F")) {
            System.out.println(TempConverter.celsiusToFahrenheit(temp));
        } else if (mode.equals("F_TO_C")) {
            System.out.println(TempConverter.fahrenheitToCelsius(temp));
        }

        sc.close();
    }
}

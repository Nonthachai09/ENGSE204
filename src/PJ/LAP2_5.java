package PJ;

import java.util.Scanner;

class Rectangle {
    double width;
    double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}

public class LAP2_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double width = sc.nextDouble();
        double height = sc.nextDouble();

        Rectangle rect = new Rectangle(width, height);

        System.out.println(rect.getArea());
        System.out.println(rect.getPerimeter());
    }
}

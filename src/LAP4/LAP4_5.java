package LAP4;

import java.util.Scanner;

final class Color {
    private final int red;
    private final int green;
    private final int blue;

    public Color(int r, int g, int b) {
        this.red = clamp(r);
        this.green = clamp(g);
        this.blue = clamp(b);
    }

    private int clamp(int value) {
        if (value < 0) return 0;
        if (value > 255) return 255;
        return value;
    }

    public int getRed() {
        return red;
    }

    public int getGreen() {
        return green;
    }

    public int getBlue() {
        return blue;
    }

    public void displayRGB() {
        System.out.println("R = " + red + " G = " + green + " B = " + blue);
    }
}

public class LAP4_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt();
        int g = sc.nextInt();
        int b = sc.nextInt();

        Color color = new Color(r, g, b);
        color.displayRGB();
    }
}

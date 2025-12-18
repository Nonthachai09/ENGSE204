package LAP4;

import java.util.Scanner;

class TimePeriod {
    private int startHour;
    private int endHour;

    public TimePeriod() {
        this(9, 17);
    }

    public TimePeriod(int startHour, int endHour) {
        int s = startHour;
        int e = endHour;

        if (s < 0) s = 0;
        if (s > 23) s = 23;
        if (e < 0) e = 0;
        if (e > 23) e = 23;

        if (s > e) {
            int temp = s;
            s = e;
            e = temp;
        }

        this.startHour = s;
        this.endHour = e;
    }

    public void displayPeriod() {
        System.out.println(startHour + ":00-" + endHour + ":00");
    }
}

public class LAP4_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();
        TimePeriod period;

        if (mode == 1) {
            period = new TimePeriod();
        } else {
            int start = sc.nextInt();
            int end = sc.nextInt();
            period = new TimePeriod(start, end);
        }

        period.displayPeriod();
    }
}

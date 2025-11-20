package PJ;

import java.util.Scanner;

public class LAP9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / N;

        System.out.println(average);

        sc.close();
    }
}

package PJ;

import java.util.Scanner;

public class LAP11 {

    public static int sumArray(int[] numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return sum;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] numbers = new int[N];

        for (int i = 0; i < N; i++) {
            numbers[i] = sc.nextInt();
        }

        int result = sumArray(numbers);

        System.out.println(result);

        sc.close();
    }
}

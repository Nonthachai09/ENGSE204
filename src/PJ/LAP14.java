package PJ;

import java.util.Scanner;

public class LAP14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int R = sc.nextInt();
        int C = sc.nextInt();

        char[][] map = new char[R][C];

        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                map[i][j] = sc.next().charAt(0);
            }
        }

        int targetR = sc.nextInt();
        int targetC = sc.nextInt();

        if (map[targetR][targetC] == '*') {
            System.out.println("Mine");
        } else {
 
            int count = 0;

            int[] dR = {-1, -1, -1, 0, 0, 1, 1, 1};
            int[] dC = {-1, 0, 1, -1, 1, -1, 0, 1};

            for (int i = 0; i < 8; i++) {
                int newR = targetR + dR[i];
                int newC = targetC + dC[i];

                if (newR >= 0 && newR < R && newC >= 0 && newC < C) {
                    if (map[newR][newC] == '*') {
                        count++;
                    }
                }
            }

            System.out.println(count);
        }

        sc.close();
    }
}

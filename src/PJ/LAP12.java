package PJ;

import java.util.Scanner;

public class LAP12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        int[] productID = new int[N];
        int[] stockQty = new int[N];

        for (int i = 0; i < N; i++) {
            productID[i] = sc.nextInt();  
            stockQty[i] = sc.nextInt();   
        }

        int searchID = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < N; i++) {
            if (productID[i] == searchID) {
                System.out.println(stockQty[i]);
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product " + searchID + " not found");
        }

        sc.close();
    }
}

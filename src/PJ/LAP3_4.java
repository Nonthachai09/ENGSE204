package PJ;

import java.util.Scanner;

class Product {
    private String name;
    private static int productCount = 0;

    public Product(String name) {
        this.name = name;
        productCount++;
    }

    public String getName() {
        return name;
    }

    public static int getProductCount() {
        return productCount;
    }
}

public class LAP3_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            String productName = sc.next();
            new Product(productName);
        }

        System.out.println(Product.getProductCount());
    }
}

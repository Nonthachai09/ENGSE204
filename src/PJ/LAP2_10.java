package PJ;

import java.util.Scanner;

class Product {
    String name;
    double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

class ShoppingCart {
    Product[] items = new Product[10];
    int itemCount = 0;

    public void addProduct(Product p) {
        if (itemCount < items.length) {
            items[itemCount] = p;
            itemCount++;
        }
    }

    public double calculateTotalPrice() {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].price;
        }
        return total;
    }
}

public class LAP2_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ShoppingCart cart = new ShoppingCart();

        for (int i = 0; i < N; i++) {
            String name = sc.next();
            double price = sc.nextDouble();
            Product p = new Product(name, price);
            cart.addProduct(p);
        }

        System.out.println(cart.calculateTotalPrice());
        sc.close();
    }
}

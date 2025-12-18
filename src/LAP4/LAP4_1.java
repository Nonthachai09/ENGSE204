package LAP4;

import java.util.Scanner;

class Book {
    private String title;
    private String author;

    public Book(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

public class LAP4_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mode = sc.nextInt();
        sc.nextLine();

        Book book;

        if (mode == 1) {
            String title = sc.nextLine();
            book = new Book(title);
        } else {
            String title = sc.nextLine();
            String author = sc.nextLine();
            book = new Book(title, author);
        }

        book.displayInfo();
    }
}

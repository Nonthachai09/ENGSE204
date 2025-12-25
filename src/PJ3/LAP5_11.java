package PJ3;

import java.util.Scanner;

class Document {
    protected String title;

    public Document(String docTitle) {
        title = docTitle;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String tTitle, int tWords) {
        super(tTitle);
        wordCount = tWords;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String pTitle, int pPages) {
        super(pTitle);
        pageCount = pPages;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

public class LAP5_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String textTitle1 = sc.nextLine();
        int textWords1 = sc.nextInt();
        sc.nextLine();

        String pdfTitle1 = sc.nextLine();
        int pdfPages1 = sc.nextInt();
        sc.nextLine();

        String textTitle2 = sc.nextLine();
        int textWords2 = sc.nextInt();
        sc.nextLine();

        String pdfTitle2 = sc.nextLine();
        int pdfPages2 = sc.nextInt();

        Document d1 = new TextDocument(textTitle1, textWords1);
        Document d2 = new PDFDocument(pdfTitle1, pdfPages1);
        Document d3 = new TextDocument(textTitle2, textWords2);
        Document d4 = new PDFDocument(pdfTitle2, pdfPages2);

        Document[] docs = {d1, d2, d3, d4};

        int totalPages = 0;
        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages += pdf.pageCount;
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);
    }
}

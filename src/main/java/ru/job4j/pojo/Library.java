package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book novel = new Book("Evgeniy Onegin", 448);
        Book technical = new Book("Clean code", 360);
        Book detective = new Book("A Study in Scarlet", 134);
        Book fantasy = new Book("The invisible man", 384);
        Book[] books = new Book[4];
        books[0] = novel;
        books[1] = technical;
        books[2] = detective;
        books[3] = fantasy;
        System.out.println("Library content:");
        for (Book element : books) {
            System.out.println(element.getName() + ": " +  element.getPages() + " pages");
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        System.out.println();
        System.out.println("Library after swap:");
        for (Book element : books) {
            System.out.println(element.getName() + ": " +  element.getPages() + " pages");
        }
        System.out.println();
        System.out.println("Books named \"Clean code\":");
        for (Book element : books) {
            if ("Clean code".equals(element.getName())) {
                System.out.println(element.getName() + ": " +  element.getPages() + " pages");
            }
        }
    }
}

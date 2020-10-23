package com.bazlur.testApp;

public class TestApp {
    public static void main(String[] args) {
        Author author = new Author("Tamim Shahriar Subeen", "book@subeen.com", 'M');
        Book book = new Book("Computer Programming", author, 250, 1000);

        System.out.println("Name of the Book: "+book.getName());
        System.out.println("Nmae of the Author: "+book.getAuthor().getName());
        System.out.println("Price of The book: "+book.getPrice());
        System.out.println("Available in stock: "+book.getInStock());
    }
}

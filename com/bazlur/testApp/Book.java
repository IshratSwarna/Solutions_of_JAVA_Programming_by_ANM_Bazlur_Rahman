package com.bazlur.testApp;

public class Book {
    private String name;
    private Author author;
    private int price;
    private int inStock;

    public Book(String name, Author author, int price, int inStock){
        this.name = name;
        this.author = author;
        this.price = price;
        this.inStock = inStock;
    }

    //getter-setter method
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Author getAuthor(){
        return author;
    }
    public void setAuthor(Author author){
        this.author = author;
    }

    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getInStock(){
        return inStock;
    }
    public void setInStock(int inStock){
        this.inStock = inStock;
    }
}

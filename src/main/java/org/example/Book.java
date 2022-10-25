package org.example;

public class Book {

    private Author author;
    private Double price;
    private String name;

    public Book(Author author, Double price, String name) {
        this.author = author;
        this.price = price;
        this.name = name;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

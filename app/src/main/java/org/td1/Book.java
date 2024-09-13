package org.td1;

public class Book {
  // Attributes
  private String title;
  private String author;
  private double price;

  // Constructor to initialize attributes
  public Book(String title, String author, double price) {
    this.title = title;
    this.author = author;
    this.price = price;
  }

  // Getter and Setter for Title
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  // Getter and Setter for Author
  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  // Getter and Setter for Price
  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  // Method to display book details
  public void display() {
    System.out.println("Title: " + title);
    System.out.println("Author: " + author);
    System.out.println("Price: $" + price);
  }
}

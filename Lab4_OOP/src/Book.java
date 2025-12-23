/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
public class Book {
    public String title;
    public String author;
    public String publisher;
    public int yearPublished;
    public double price;
    public boolean isAvailable;
    
    public boolean isPublishedAfter(int Year) {
        if (yearPublished > Year) {
            return true;
        } else return false;
    }
    public void markAsAvailable() {
        isAvailable = true;
    }
    public void markAsUnavailable() {
        isAvailable = false;
    }
    public void printDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisher);
        System.out.println("Year Published: " + yearPublished);
        System.out.println("Price: $" + price);
        System.out.print("Available: ");
        if(isAvailable == true)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
    public void updatePrice(double newPrice) {
        price = newPrice;
    }
}

public class Library {
    Book book1 = new Book();
    Book book2 = new Book();
    Book book3 = new Book();
    String libraryName;
    
    public void addBook(Book book, int slot) {
        switch (slot) {
            case 1 -> book1 = book;
            case 2 -> book2 = book;
            case 3 -> book3 = book;
        }
    }
    public void removeBook(int slot) {
        switch (slot) {
            case 1 -> book1 = null;
            case 2 -> book2 = null;
            case 3 -> book3 = null;
        }
    }
    public void printLibraryDetails() {
        System.out.println("Library: " + libraryName);
        book1.printDetails();
        book2.printDetails();
        book3.printDetails();
    }
    public void checkBookAvailability(int slot) {
        if (){
            System.out.println(" is available.");
        } else if () {
            System.out.println("Book in slot " + slot + "is not available.");
        }
    }
    public void updateBookPrice(int slot, double newPrice) {
        
    }
    public void printBookDetails(Book book) {}
}
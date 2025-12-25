/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Achoo_QwQ
 */
public class Library {
    public String libraryName;
    public Book book1; 
    public Book book2; 
    public Book book3;

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
        System.out.println("");
        if (book1 != null) book1.printDetails();
        else System.out.println("No book in this slot.");
        System.out.println("");
        if (book2 != null) book2.printDetails();
        else System.out.println("No book in this slot.");
        System.out.println("");
        if (book3 != null) book3.printDetails();
        else System.out.println("No book in this slot.");
    }

    public void checkBookAvailability(int slot) {
        Book book = null; 
        switch (slot) {
            case 1 -> book = book1;
            case 2 -> book = book2;
            case 3 -> book = book3;
        }

        if (book != null) {
            System.out.println(book.title + " is available.");
        } else {
            System.out.println("Book in slot " + slot + " is not available."); 
        }
    }

    public void updateBookPrice(int slot, double newPrice) {
        Book book = null;
        switch (slot) {
            case 1 -> book = book1;
            case 2 -> book = book2;
            case 3 -> book = book3;
        }

        if (book != null) {
            book.updatePrice(newPrice);
            System.out.println("Updated price of " + book.title + " to $" + newPrice + ".");
        } else {
            System.out.println("No book in this slot.");
        }
    }

    public void printBookDetails(Book book) {
        if (book != null) {
            book.printDetails();
        } else {
            System.out.println("No book in this slot.");
        }
    }
}
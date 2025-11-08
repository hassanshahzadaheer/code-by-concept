package book_shop;

public class Book {
    // 1. Fields (Instance Variables) - Define the state of a Book object
    private String title;
    private String author;
    private String isbn;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        System.out.println("New Book has been added " + title);
    }

    public void displayDetails() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("ISBN: " + this.isbn);
    }

    public String updateISBN(String isbn) {
        System.out.println("Updated ISBN "+ isbn);
        return this.isbn = isbn;
    }



    public static void main(String[] args) {
        Book myBook = new Book("Java How to program","David Malan", "123-9987-333");
        var updatedISBN = myBook.updateISBN("98733-99772-3444");
        myBook.displayDetails();
    }

}


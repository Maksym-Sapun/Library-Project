package bookItem;

import baseClasses.LibraryItem;

public class BookItem extends LibraryItem {
    private String publisher;
    private String genre;

    public BookItem() {
        publisher = "publisher of book";
        genre = "genre of book";
    }

    public BookItem(String publisher, String genre) {
        this.publisher = publisher;
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public void research() {
        System.out.println("Book reading");
    }
    @Override
    public void displayDetails() {
        System.out.println(publisher);
        System.out.println(genre);
    }
    @Override
    public void calculateLateFee() {
        System.out.println("Return book late fee 30$");
    }
}

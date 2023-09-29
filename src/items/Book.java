package items;

import baseClasses.LibraryItem;
import baseClasses.ReadableItem;
import interfaces.ReadableActions;

public class Book extends ReadableItem implements ReadableActions {

    public Book(long id, String author, String title, String description, boolean availability, int totalPages, int currentPage) {
        super(id, author, title, description, availability, totalPages, currentPage);
    }

    @Override
    public void nextPage() {
        if (currentPage == totalPages) {
            System.out.println("This is the last page of the book. \nReturning to the first page");
            this.returnOnTheFirst();
        }
        else {
            this.currentPage = currentPage + 1;
            System.out.println("Previous page of the book: " + (currentPage - 1));
            this.showCurrentPage();
        }
    }

    @Override
    public void previousPage() {
        if (currentPage == 1) {
            System.out.println("You already on the first page of the book");
        }
        else {
            this.currentPage = currentPage - 1;
            System.out.println("Previous page of the book: " + (currentPage + 1));
            this.showCurrentPage();
        }
    }

    @Override
    public void returnOnTheFirst() {
        this.currentPage = 1;
        this.showCurrentPage();
    }

    @Override
    public void showCurrentPage() {
        System.out.println("Current page of the book: " + currentPage);
    }

}

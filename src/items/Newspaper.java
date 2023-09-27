package items;

import baseClasses.LibraryItem;
import interfaces.ReadableItems;

public class Newspaper extends LibraryItem implements ReadableItems {

    public int totalPages;
    public int currentPage;

    public Newspaper(long id, String author, String title, String description, boolean availability, int totalPages, int currentPage) {
        super(id, author, title, description, availability);
        this.totalPages = totalPages;
        this.currentPage = currentPage;
    }

    @Override
    public void nextPage() {
        if (currentPage == totalPages) {
            System.out.println("This is the last page of the newspaper. \nReturning to the first page");
            this.returnOnTheFirst();
        }
        else {
            this.currentPage = currentPage + 1;
            System.out.println("Previous page of the newspaper: " + (currentPage - 1));
            this.showCurrentPage();
        }
    }

    @Override
    public void previousPage() {
        if (currentPage == 1) {
            System.out.println("You already on the first page of the newspaper");
        }
        else {
            this.currentPage = currentPage - 1;
            System.out.println("Previous page of the newspaper: " + (currentPage + 1));
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
        System.out.println("Current page of the newspaper: " + currentPage);
    }
}

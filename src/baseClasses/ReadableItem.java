package baseClasses;

import interfaces.ReadableActions;

public class ReadableItem extends AbstractLibraryItem implements ReadableActions {

    public int totalPages;
    public int currentPage;

    public ReadableItem(long id, String author, String title, String description, boolean availability, int totalPages, int currentPage) {
        super(id, author, title, description, availability);

        this.totalPages = totalPages;
        this.currentPage = currentPage;
    }

    @Override
    public void checkInItem(long id) {
        if (super.getId() != id) {
            System.out.println("You are trying to return readable item with wrong id. \nCurrent item id is: " + id);
            return;
        }
        if (super.availability == true) {
            System.out.println("You are trying to return readable item which already in library");
        } else {
            super.availability = true;
        }
    }

    @Override
    public void checkOutItem() {
        if (super.availability == true) {
            super.availability = false;
        } else {
            System.out.println("Item not in the library");
        }
    }

    @Override
    public void nextPage() {

    }

    @Override
    public void previousPage() {

    }

    @Override
    public void returnOnTheFirst() {

    }

    @Override
    public void showCurrentPage() {

    }
}

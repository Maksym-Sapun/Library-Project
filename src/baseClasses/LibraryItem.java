package baseClasses;


public class LibraryItem {

    private long id;
    private String author;
    private String title;
    private String description;
    private boolean availability;

    private LibraryItem() {

    }

    public LibraryItem(long id, String author, String title, String description, boolean availability) {

        this.id = id;
        this.author = author;
        this.title = title;
        this.description = description;
        this.availability = availability;
    }


    public void checkInItem(long id) {
        if (this.id != id) {
            System.out.println("You are trying to return item with wrong id. \nCurrent item id is: " + id);
            return;
        }
        if (availability == true) {
            System.out.println("You are trying to return item which already in library");
        } else {
            availability = true;
        }
    }


    public void checkOutItem() {
        if (availability == true) {
            availability = false;
        } else {
            System.out.println("Item not in a library");
        }
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void increaseVolume() {
        System.out.println("LibraryItem volume increased");
    }


    public void decreaseVolume() {
        System.out.println("LibraryItem volume decreased");
    }


    public void muteVolume() {
        System.out.println("LibraryItem volume muted");
    }


    public void nextPage() {
        System.out.println("Turning on the next page of Library Item");
    }


    public void previousPage() {
        System.out.println("Turning on the previous page of Library Item");
    }


    public void returnOnTheFirst() {
        System.out.println("Returning on the first page of Library Item");
    }


    public void showCurrentPage() {
        System.out.println("Showing current page of Library Item");
    }


    public void fastForwardPlus() {
        System.out.println("The Library Item rewound by 10 seconds");
    }


    public void fastForwardMinus() {
        System.out.println("The Library Item rewound 10 seconds back");
    }

}


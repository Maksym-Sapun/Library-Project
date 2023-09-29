package baseClasses;

public abstract class AbstractLibraryItem {

    private long id;
    private String author;
    private String title;
    private String description;
    protected boolean availability;

    public AbstractLibraryItem(long id, String author, String title, String description, boolean availability) {
        this.id = id;
        this.author = author;
        this.title = title;
        this.description = description;
        this.availability = availability;
    }

    public abstract void checkInItem(long id);

    public abstract void checkOutItem();

    public long getId() {
        return id;
    }

    public boolean getAvailability() {
        return availability;
    }
}

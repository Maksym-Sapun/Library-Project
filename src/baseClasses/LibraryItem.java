package baseClasses;

public class LibraryItem extends AbstractLibraryItem {
    private String itemId;
    private String title;
    private boolean isCheckedOut;

    public LibraryItem() {
        itemId = "no itemId";
        title = "no title";
        isCheckedOut = false;
    }

    public LibraryItem(String itemId, String title) {
        this.itemId = itemId;
        this.title = title;
    }

    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void checkOut() {
        this.isCheckedOut = true;
    }

    public void checkIn() {
        this.isCheckedOut = false;
    }

    public void research () {
        System.out.println("researching Library Item");
    }
    public void displayDetails() {
        System.out.println(itemId);
        System.out.println(title);
        System.out.println(isCheckedOut);
    }

    @Override
    public void calculateLateFee(){
        System.out.println("Return item late Fee 20$");
    }

}


package baseClasses;

import interfaces.VideoActions;

public class VideoItem extends AbstractLibraryItem implements VideoActions {

    public int duration;

    public VideoItem(long id, String author, String title, String description, boolean availability, int duration) {
        super(id, author, title, description, availability);
        this.duration = duration;
    }

    @Override
    public void checkInItem(long id) {
        if (this.getId() != id) {
            System.out.println("You are trying to return video item with wrong id. \nCurrent item id is: " + id);
            return;
        }
        if (super.availability == true) {
            System.out.println("You are trying to return video item which already in library");
        } else {
            super.availability = true;
        }
    }

    @Override
    public void checkOutItem() {
        if (super.availability == true) {
            super.availability = false;
        } else {
            System.out.println("Item not in a library");
        }
    }

    @Override
    public void fastForwardPlus() {

    }

    @Override
    public void fastForwardMinus() {

    }
}

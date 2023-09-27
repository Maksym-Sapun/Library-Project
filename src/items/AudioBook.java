package items;

import baseClasses.LibraryItem;
import interfaces.AudioItems;

public class AudioBook extends LibraryItem implements AudioItems {

    public int duration;

    public AudioBook(long id, String author, String title, String description, boolean availability, int duration) {
        super(id, author, title, description, availability);
        this.duration = duration;
    }

    @Override
    public void increaseVolume() {
        System.out.println("Audio book volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Audio book volume decreased");
    }
}

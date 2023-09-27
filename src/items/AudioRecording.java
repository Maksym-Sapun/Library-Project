package items;

import baseClasses.LibraryItem;
import interfaces.AudioItems;

public class AudioRecording extends LibraryItem implements AudioItems {

    public int duration;

    public AudioRecording(long id, String author, String title, String description, boolean availability, int duration) {
        super(id, author, title, description, availability);
        this.duration = duration;
    }

    @Override
    public void increaseVolume() {
        System.out.println("Audio recording volume increased");
    }

    @Override
    public void decreaseVolume() {
        System.out.println("Audio recording volume decreased");
    }
}

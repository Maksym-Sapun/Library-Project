package items;

import baseClasses.LibraryItem;
import interfaces.AudioItems;

public class AudioBook extends LibraryItem implements AudioItems {

    public int duration;
    public int volume;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;
//TODO make volume in constructor rounds
    public AudioBook(long id, String author, String title, String description, boolean availability, int duration, int volume) {
        super(id, author, title, description, availability);
        if (volume < MIN_VOLUME || volume > MAX_VOLUME) {
            System.out.println("Type volume from 0 to 100");
        }
        else {
            this.volume = volume;
        }
        this.duration = duration;
    }

    @Override
    public void increaseVolume() {
        if( volume == 100) {
            System.out.println("Maximum volume of audio book");
        }
        else {
            this.volume = volume + 10;
            System.out.println("Volume of audio book is: " + volume + "%");
        }
    }

    @Override
    public void decreaseVolume() {
        if( volume == 0) {
            System.out.println("Minimum volume of audio book");
        }
        else {
            this.volume = volume - 10;
            System.out.println("Volume of audio book is: " + volume + "%");
        }
    }

    @Override
    public void muteVolume() {
        this.volume = 0;
        System.out.println("Volume of audio book Muted");
    }
}

package items;

import baseClasses.AudioItem;
import interfaces.AudioActions;

public class AudioBook extends AudioItem implements AudioActions {

//TODO make volume in constructor rounds
    public AudioBook(long id, String author, String title, String description, boolean availability, int duration, int volume) {
        super(id, author, title, description, availability, duration, volume);
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

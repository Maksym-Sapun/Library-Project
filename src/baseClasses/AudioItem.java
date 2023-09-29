package baseClasses;

import interfaces.AudioActions;

public class AudioItem extends AbstractLibraryItem implements AudioActions {

    public int duration;
    public int volume;
    public static final int MAX_VOLUME = 100;
    public static final int MIN_VOLUME = 0;

    public AudioItem(long id, String author, String title, String description, boolean availability, int duration, int volume) {
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
    public void checkInItem(long id) {
        if (super.getId() != id) {
            System.out.println("You are trying to return audio item with wrong id. \nCurrent item id is: " + id);
            return;
        }
        if (super.availability == true) {
            System.out.println("You are trying to return audio item which already in library");
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
    public void increaseVolume() {
        if( volume == 100) {
            System.out.println("Maximum volume of audio item");
        }
        else {
            this.volume = volume + 10;
            System.out.println("Volume of audio item is: " + volume + "%");
        }
    }

    @Override
    public void decreaseVolume() {
        if( volume == 0) {
            System.out.println("Minimum volume of audio item");
        }
        else {
            this.volume = volume - 10;
            System.out.println("Volume of audio item is: " + volume + "%");
        }
    }

    @Override
    public void muteVolume() {
        this.volume = 0;
        System.out.println("Volume of audio item Muted");
    }
}

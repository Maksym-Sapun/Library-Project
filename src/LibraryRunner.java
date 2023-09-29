import baseClasses.AudioItem;
import baseClasses.ReadableItem;
import baseClasses.VideoItem;
import items.*;

import java.util.ArrayList;
import java.util.List;


public class LibraryRunner {


    public static void main(String[] args) {

        AudioItem aRec = new AudioRecording(25, "Tom", "Auto biography", "Book about Tom", true, 300, 70 );
        AudioItem aBook = new AudioBook(65, "Ben", "1917", "Book about WWI", true, 600, 50 );
        ReadableItem book = new Book(23, "Steven King", "Dead Cat", "Book about dead cat", true, 250, 1);
        ReadableItem magazine = new Magazine(45, "Discovery inc.", "Discovery", "Magazine about our planet", true, 16, 15);
        VideoItem film = new Film(35, "Sony Pictures", "Thor", "Movie about guy with big hummer", true, 120);

        //TODO Generic type has already been declared
        List <Object> itemsList = new ArrayList<Object>();
        itemsList.add(aBook);
        itemsList.add(aRec);
        itemsList.add(book);
        itemsList.add(magazine);
        itemsList.add(film);

        for (Object item:itemsList) {
            if (item instanceof AudioItem) {
                ((AudioItem) item).increaseVolume();
            }
            else if (item instanceof ReadableItem) {
                ((ReadableItem) item).nextPage();
            }
            else if (item instanceof VideoItem) {
                ((VideoItem) item).fastForwardMinus();
            }

        }

//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.increaseVolume();
//        ABook.muteVolume();
//        ABook.decreaseVolume();


//        book.nextPage();
//        book.checkInItem(45678);
//
//        magazine.nextPage();
//        magazine.nextPage();
//
//
//        film.fastForwardMinus();
//
//        System.out.println(book instanceof VideoActions);


    }
}

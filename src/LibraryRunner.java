import baseClasses.LibraryItem;
import items.Book;
import items.Magazine;

import java.util.Date;

public class LibraryRunner {


    public static void main(String[] args) {


        LibraryItem book = new Book(23, "Steven King", "Dead Cat", "Book about dead cat", true, 250, 1);
        book.nextPage();
        book.checkInItem(45678);

//        LibraryItem magazine = new Magazine(45, "Discovery inc.", "Discovery", "Magazine about our planet", true, 16, 15);
//        magazine.nextPage();
//        magazine.nextPage();

//
//        LibraryItem film = new Film(35, "Sony Pictures", "Thor", "Movie about guy with big hummer", true, 120);
//        film.fastForwardMinus();
//
//        System.out.println(book instanceof VideoItems);


    }
}

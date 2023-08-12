import baseClasses.LibraryItem;
import bookItem.*;
import mediaItem.MediaItem;

public class LibraryRuner {


    public static void main(String args[]) {
       // Book b = new Book();
       // Member m = new Member();
        //BookItem bookItem = new BookItem();
        //MediaItem mediaItem = new MediaItem();

        LibraryItem lib = new LibraryItem();
        lib = new BookItem();
        lib = new MediaItem();
        lib.calculateLateFee();
        lib.calculateLateFee();
        lib.calculateLateFee();
        System.out.println(lib.getItemId());



    }
}

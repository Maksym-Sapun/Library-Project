package items;

import baseClasses.LibraryItem;
import interfaces.VideoItems;

public class Film extends LibraryItem implements VideoItems {

    public int duration;

    public Film(long id, String author, String title, String description, boolean availability, int duration) {
        super(id, author, title, description, availability);
        this.duration = duration;
    }

    @Override
    public void fastForwardPlus() {
        System.out.println("The film rewound by 10 seconds");
    }

    @Override
    public void fastForwardMinus() {
        System.out.println("The film rewound 10 seconds back");
    }
}

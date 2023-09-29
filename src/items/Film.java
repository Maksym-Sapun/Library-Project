package items;

import baseClasses.VideoItem;
import interfaces.VideoActions;

public class Film extends VideoItem implements VideoActions {

    public Film(long id, String author, String title, String description, boolean availability, int duration) {
        super(id, author, title, description, availability, duration);
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

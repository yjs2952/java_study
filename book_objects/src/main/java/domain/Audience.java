package domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Audience {

    private Bag bag;

    public Audience(Bag bag) {
        this.bag = bag;
    }
}

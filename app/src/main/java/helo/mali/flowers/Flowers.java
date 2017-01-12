package helo.mali.flowers;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used to create
 */

public class Flowers {

    // List of Flowers
    public static ArrayList<Flower> LIST = new ArrayList<Flower>();

    static {

        addItem(new Flower("lule bore", "Lule ne male te larta"));
        addItem(new Flower("lule dafine", "Lule"));
        addItem(new Flower("lule djelli", "Lule qe ndjek djellin, prandaj edhe emri"));
    }

    private static void addItem(Flower item) {
        LIST.add(item);
    }
}

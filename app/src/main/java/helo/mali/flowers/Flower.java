package helo.mali.flowers;

/**
 * This class represents a flower.
 *
 */

public class Flower {
    // Attributes
    private String mName;
    private String mDescription;
    //private String mPlace;
    //private String mPlaceDescription;
    //private ArrayList<Integer> mColors;
    //private int mImage;

    // Create Flower object
    public Flower(String name, String description){
                  //String place, String placeDescription,
                  //ArrayList<Integer> colors, int image){

        mName = name;
        mDescription = description;
        //mPlace = place;
        //mPlaceDescription = placeDescription;
        //mColors = colors;
        //mImage = image;

    }


    /**
     * Methods for geting flower attributes.
     */
    public String getName() {
        return mName;
    }

    public String getDescription() {
        return mDescription;
    }
    /*
    public String getPlace() {
        return mPlace;
    }

    public String getPlaceDescription() {
        return mPlaceDescription;
    }

    public ArrayList<Integer> getColors() {
        return mColors;
    }

    public int getImage() {
        return mImage;
    }
    */
}

package com.example.android.tarantoguide;

public class Location {

    /**
     * Parameters of Location object
     */

    private String mNameLocation;
    private String mAddressLocation;
    private int mImageLocation;

    /**
     * @param nameLocation    is the name of the location
     * @param addressLocation is the address of the location
     * @param imageLocation   is the picture of the location
     */

    /*
    Constructor
     */
    public Location(String nameLocation, String addressLocation, int imageLocation) {
        mNameLocation = nameLocation;
        mAddressLocation = addressLocation;
        mImageLocation = imageLocation;
    }

/*
Get Location's name
 */

    public String getNameLocation() {
        return mNameLocation;
    }
/*
Get Location's address
 */

    public String getAddressLocation() {
        return mAddressLocation;
    }


    public int getImageLocation() {
        return mImageLocation;
    }

}
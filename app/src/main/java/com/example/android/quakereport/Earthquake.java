package com.example.android.quakereport;

public class Earthquake {
    // Name of the Android version (e.g. Gingerbread, Honeycomb, Ice Cream Sandwich)
    private Double mMagnitude;

    // Android version number (e.g. 2.3-2.7, 3.0-3.2.6, 4.0-4.0.4)
    private String mLocation;

    // Drawable resource ID
//    private String mDate;
    private long mTimeInMilliseconds;

    /** Website URL of the earthquake */
    private String mUrl;

    /*
     * Create a new AndroidFlavor object.
     *
     * @param vName is the name of the Android version (e.g. Gingerbread)
     * @param vNumber is the corresponding Android version number (e.g. 2.3-2.7)
     * @param image is drawable reference ID that corresponds to the Android version
     * */
//    public Earthquake(String vName, String vNumber, String imageResourceId)
//    {
//        mMagnitude = vName;
//        mLocation = vNumber;
//        mDate = imageResourceId;
//    }
//    /**
//     * Constructs a new {@link Earthquake} object.
//     *
//     * @param magnitude is the magnitude (size) of the earthquake
//     * @param location is the city location of the earthquake
//     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
//     *  earthquake happened
//     */
//    public Earthquake(Double magnitude, String location, long timeInMilliseconds) {
//        mMagnitude = magnitude;
//        mLocation = location;
//        mTimeInMilliseconds = timeInMilliseconds;
//    }
    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }



//    public Earthquake(String magnitude, String location, String dateToDisplay) {
//    }


    /**
     * Get the name of the Android version
     */
//    public String getMagnitude() {
//        return mMagnitude;
//    }
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the Android version number
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the image resource ID
     */
//    public String getDate() {
//        return mDate;
//    }
    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public String getUrl() {
        return mUrl;
    }


}


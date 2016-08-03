package com.example.android.miwok;

import android.content.Context;
import android.view.View;

/**
 * Created by Denis on 26-Jul-16.
 */
public class Word {
    // String value
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;


    /*
    * Create a new Word object.
    * @param defaultTranslation is the word in a language that the user is already familiar with
    * @param miwokTranslation is the word in the Miwok language
    */

    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /*
    * Create a new Word object.
    * @param defaultTranslation is the word in a language that the user is already familiar with
    * @param miwokTranslation is the word in the Miwok language
    * @param imageResourceId is the drawable resource for the image associated with the word
    */

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
    }

    /*
    * Get the default translation of the word
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /*
    * Get the MIWOK translation of the word
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     +     * Return the image resource ID of the word.
     +     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /*Returns whether or not there is an image for this word.*/
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }


}
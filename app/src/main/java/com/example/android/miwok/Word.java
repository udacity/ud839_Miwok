package com.example.android.miwok;

import android.content.Context;

/**Represents a vocabulary word that */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID;


    public Word(String defaultTranslation, String miwokTranslation){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.mMiwokTranslation = miwokTranslation;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public void setDefaultTranslation(String defaultTranslation) {
        this.mDefaultTranslation = defaultTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceID;

    }
}

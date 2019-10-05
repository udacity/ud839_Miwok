package com.example.android.miwok;

import android.content.Context;

/**Represents a vocabulary word that */
public class Word {

    private String mMiwokTranslation;
    private String mDefaultTranslation;
    private int mImageResourceID = NO_RESOURCE_PROVIDED;
    private int mAudioResourceID = NO_RESOURCE_PROVIDED;
    private static final int NO_RESOURCE_PROVIDED = -1;


    public Word(String defaultTranslation, String miwokTranslation, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = -1;
        mAudioResourceID = audioResourceID;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceID, int audioResourceID){
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceID = imageResourceID;
        mAudioResourceID = audioResourceID;
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

    public int getAudioResourceID(){
        return mAudioResourceID;
    }

    public boolean hasImage() {
        return mImageResourceID != NO_RESOURCE_PROVIDED;
    }

}

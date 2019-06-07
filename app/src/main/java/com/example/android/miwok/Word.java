package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageResourceId;

    private final int NO_IMAGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        mImageResourceId = NO_IMAGE_PROVIDED;
    }

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
    }

    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
    public int getmImageResourceId() {
        return mImageResourceId;
    }
    public boolean hasImage()
    {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}

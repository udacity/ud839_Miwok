package com.example.android.miwok;

/**
 * Created by Guilherme on 16/08/2017.
 */

public class Word {

    private static final int NO_IMAGE_PROVIDED =  -1;
    private String mDefaultTranslation;
    private String mMiwokTranslation;
    private int mImageId = NO_IMAGE_PROVIDED;
    private int mSongId;

    public Word(String defaultTranslation, String miwokTranslation, int songId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mSongId = songId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageId, int songId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageId = imageId;
        mSongId = songId;
    }

    public boolean hasImage(){
        return mImageId != NO_IMAGE_PROVIDED;
    }

    public int getSongId() {
        return mSongId;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' +
                ", mMiwokTranslation='" + mMiwokTranslation + '\'' +
                ", mImageId=" + mImageId +
                ", mSongId=" + mSongId +
                '}';
    }
}

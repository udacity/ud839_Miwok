package com.example.android.miwok;

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    //Miwok translation for the word
    private String mMiwokTranslation;
    // Drawable resource ID
    private int mImageResourceId=NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;
    //variable for audio
    private int mAudioResourceId;

    public Word(String DefaultTranslation, String MiwokTranslation, int imageResourceId,int audioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId=audioResourceId;
    }

    public Word(String DefaultTranslation, String MiwokTranslation,int audioResourceId) {
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mAudioResourceId=audioResourceId;
    }

    /**
     * Get the name of the Android version
     */
    public String getmDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Android version number
     */
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return whether or not there is an image for this word.
     */
    public boolean hasImage(){
        return mImageResourceId!=NO_IMAGE_PROVIDED;
    }

    /**
     *
     */
    public int getAudioResourceId(){return mAudioResourceId;}


}

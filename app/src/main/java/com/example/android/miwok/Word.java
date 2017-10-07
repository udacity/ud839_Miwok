package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private  String mMiwokTranslation;
    private static final int NO_IMAGE_PROVIDED = -1;
    private int mImageResourceId = NO_IMAGE_PROVIDED;


    //Constructor for updating Word , rem : no return type
    public Word(String DefaultTranslation,String MiwokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public Word(String DefaultTranslation,String MiwokTranslation,int imageResourceId){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
        mImageResourceId = imageResourceId;
    }

    //get english or default translation
    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    //get miwok translation
    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

    public int getImageResourceId(){
        return mImageResourceId;
    }

    //returns if it has an image or not
    public boolean hasImage(){
        return (NO_IMAGE_PROVIDED != mImageResourceId);

    }
}

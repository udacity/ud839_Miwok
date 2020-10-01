package com.example.android.miwok;

public class Word {
    // Default translation of words
    private String mDefaultTranslation;
    // miwok translation of words
    private String mMovikTranslation;
    // image resource id for the words
    private int mImageResoureceId=NO_IMAGE_PROVIDED;

    private  static  final int NO_IMAGE_PROVIDED=-1;



    private int mAudioResoureceId;
    //constructor
    public Word(String defaultTranslation,String movikTranslation,int audioResoureceId){
        mMovikTranslation=movikTranslation;
        mDefaultTranslation=defaultTranslation;
        mAudioResoureceId=audioResoureceId;
    }

    //constructor
    public Word(String defaultTranslation,String movikTranslation,int imageResoureceId,int audioResoureceId){
        mMovikTranslation=movikTranslation;
        mDefaultTranslation=defaultTranslation;
        mImageResoureceId=imageResoureceId;
        mAudioResoureceId=audioResoureceId;
    }

    //get default translation
    public String getDefaultTranslation(){
        return  mDefaultTranslation;
    }

    //get miwok translation
    public  String getMiwokTranslation(){
        return mMovikTranslation;
    }
    //return the image resource id of the word
    public  int getImageResoureceId(){
        return mImageResoureceId;
    }
    public  boolean hasImage(){
        return  mImageResoureceId!=NO_IMAGE_PROVIDED;
    }


    // return the audio resource  id of the word
    public int getmAudioResoureceId(){
        return  mAudioResoureceId;
    }
}

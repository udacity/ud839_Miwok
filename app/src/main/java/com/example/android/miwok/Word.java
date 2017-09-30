package com.example.android.miwok;

public class Word {
    private String mDefaultTranslation;
    private  String mMiwokTranslation;


    //Constructor for updating Word , rem : no return type
    public Word(String DefaultTranslation,String MiwokTranslation){
        mDefaultTranslation = DefaultTranslation;
        mMiwokTranslation = MiwokTranslation;
    }

    public String getDefaultTranslation(){
        return mDefaultTranslation;
    }

    public String getMiwokTranslation(){
        return mMiwokTranslation;
    }

}

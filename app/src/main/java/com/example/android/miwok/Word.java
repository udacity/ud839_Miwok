package com.example.android.miwok;

public class Word {
    //Default translation for the word
    private String mDefaultTranslation;
    //Miwok translation for the word
    private String mMiwokTranslation;

    public Word(String DefaultTranslation,String MiwokTranslation)
    {
        mDefaultTranslation=DefaultTranslation;
        mMiwokTranslation=MiwokTranslation;

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



}

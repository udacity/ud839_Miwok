package com.example.android.miwok;

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /**
     * image resource id
     */
      private int  mAudioResourceId;
    private int mImageResourceId = NOVISIBLEIMAGES;


    private static final int NOVISIBLEIMAGES = -1;


    /**
     * audio resource id
     */


    /**
     * Constructer for PhrasesActivity
     */
    public Word(String defaultTranslation, String miwokTranslation,int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId=audioResourceId;

    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */
    public Word(String defaultTranslation, String miwokTranslation,int mImageResourceId,int mAudioResourceId ) {
        this.mDefaultTranslation = defaultTranslation;
        this.mMiwokTranslation = miwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioResourceId=mAudioResourceId;
    }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + mDefaultTranslation + '\'' + ", " +
                "mMiwokTranslation='" + mMiwokTranslation + '\'' + ", " +
                "mAudioResourceId=" + mAudioResourceId + ", " +
                "mImageResourceId=" + mImageResourceId + '}';
    }

    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Get image resource Id
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * get audio resource id

     */
    public int getAudioResourceId(){
        return mAudioResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId !=NOVISIBLEIMAGES;
    }



}

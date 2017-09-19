package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains a default translation and a Miwok translation for that word.
 */
public class Word {

    // Default translation for the word
    private String mDefaultTranslation;

    // Miwok translation for the word
    private String mMiwokTranslation;

    /**
     * Constructs a new Word with initial values for default translation and Miwok translation.
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
    }

    /**
     * Get the default translation of the word.
     * @return current word in the default translation
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     * @return current word in the Miwok translation
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }
}

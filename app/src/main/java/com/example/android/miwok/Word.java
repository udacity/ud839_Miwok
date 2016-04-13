/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

/**
 * {@link Word} represents a vocabulary word that the user wants to learn.
 * It contains resource IDs for the default translation, Miwok translation, audio file, and
 * optional image file for that word.
 */
public class Word {

    /** String resource ID for the default translation of the word */
    private int mDefaultTranslationId;

    /** String resource ID for the Miwok translation of the word */
    private int mMiwokTranslationId;

    /** Audio resource ID for the word */
    private int mAudioResourceId;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    /** Constant value that represents no image was provided for this word */
    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param miwokTranslationId is the string resource Id for the word in the Miwok language
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(int defaultTranslationId, int miwokTranslationId, int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Create a new Word object.
     *
     * @param defaultTranslationId is the string resource ID for the word in a language that the
     *                             user is already familiar with (such as English)
     * @param miwokTranslationId is the string resource Id for the word in the Miwok language
     * @param imageResourceId is the drawable resource ID for the image associated with the word
     * @param audioResourceId is the resource ID for the audio file associated with this word
     */
    public Word(int defaultTranslationId, int miwokTranslationId, int imageResourceId,
                int audioResourceId) {
        mDefaultTranslationId = defaultTranslationId;
        mMiwokTranslationId = miwokTranslationId;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the string resource ID for the default translation of the word.
     */
    public int getDefaultTranslationId() {
        return mDefaultTranslationId;
    }

    /**
     * Get the string resource ID for the Miwok translation of the word.
     */
    public int getMiwokTranslationId() {
        return mMiwokTranslationId;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns whether or not there is an image for this word.
     */
    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Return the audio resource ID of the word.
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }
}
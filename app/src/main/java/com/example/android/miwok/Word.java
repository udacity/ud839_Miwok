package com.example.android.miwok;

public class Word {
    String JapaneseWord;
    String EnglishWord;
    private int ImageResource =NO_IMAGE_PROVIDED;
    public static final int NO_IMAGE_PROVIDED =-1;
    //custom constructor take in 2 strings, english and miwak
    public Word(String english, String japanese)
    {
        JapaneseWord= japanese;
        EnglishWord = english;
    }
    public Word(String english, String japanese,int imgRes)
    {
        JapaneseWord= japanese;
        EnglishWord = english;
        ImageResource = imgRes;
    }

    public String getJapaneseWord() {
        return JapaneseWord;
    }

    public String getEnglishWord() {
        return EnglishWord;
    }
    public int getImageResourceId(){
        return ImageResource;
    }
    public boolean hasImage(){
        return ImageResource !=NO_IMAGE_PROVIDED;
    }
}

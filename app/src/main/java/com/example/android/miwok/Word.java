package com.example.android.miwok;

public class Word {
    //custom constructor take in 2 strings, english and miwak
    public Word(String english, String miwak)
    {
        MiwakWord= miwak;
        EnglishWord = english;
    }
    String MiwakWord;
    String EnglishWord;

    public String getJapaneseWord() {
        return MiwakWord;
    }

    public String getEnglishWord() {
        return EnglishWord;
    }
}

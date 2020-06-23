package com.example.android.miwok;

public class Word {
    //custom constructor take in 2 strings, english and miwak
    public Word(String english, String japanese)
    {
        JapaneseWord= japanese;
        EnglishWord = english;
    }
    String JapaneseWord;
    String EnglishWord;

    public String getJapaneseWord() {
        return JapaneseWord;
    }

    public String getEnglishWord() {
        return EnglishWord;
    }
}

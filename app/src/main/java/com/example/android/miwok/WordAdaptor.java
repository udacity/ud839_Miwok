package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdaptor extends ArrayAdapter<Word> {
    private int newBg;
    //custom constructor
    public WordAdaptor(Activity context, ArrayList<Word> words, int newCol) {
        //constructor to populate WordAdaptor with context, list.
        super(context, 0, words);
        newBg= newCol;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);
        TextView englishTextView = (TextView) listItemView.findViewById(R.id.englishWordsView);
        englishTextView.setText(currentWord.getEnglishWord());

        TextView japaneseTextView = (TextView) listItemView.findViewById(R.id.japaneseWordsView);
        japaneseTextView.setText(currentWord.getJapaneseWord());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        if(currentWord.hasImage()) {
            imageView.setImageResource(currentWord.getImageResourceId());
            imageView.setVisibility((View.VISIBLE));
        }
        else{
            imageView.setVisibility(View.GONE);
        }


        int color = ContextCompat.getColor(getContext(),newBg);
        listItemView.setBackgroundColor(color);

        return listItemView;
    }

}

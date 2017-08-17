package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Guilherme on 16/08/2017.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Word currentWord = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.numMiwokTextView);
        nameTextView.setText(currentWord.getMiwokTranslation());

        TextView numberTextView = (TextView) listItemView.findViewById(R.id.numEngTextView);
        numberTextView.setText(currentWord.getDefaultTranslation());

        ImageView iconView = (ImageView) listItemView.findViewById(R.id.imageView);
        if (currentWord.getmImageId() > 0) {
            iconView.setImageResource(currentWord.getmImageId());
        } else {
            iconView.setVisibility(View.GONE);
        }

        return listItemView;
    }

}

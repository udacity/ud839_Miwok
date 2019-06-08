package com.example.android.miwok;
import android.app.Activity;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    public int getmColorResourceId() {
        return mColorResourceId;
    }

    private int mColorResourceId;
    public WordAdapter(Activity context, ArrayList<Word> words, int colorResourceId)
    {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    public WordAdapter(Activity context, ArrayList<Word> words) {
        super(context, 0, words);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Word currentWord = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID version_name
        TextView nameTextView = listItemView.findViewById(R.id.miwok_text_view);
        // Get the version name from the current AndroidFlavor object and
        // set this text on the name TextView
        nameTextView.setText(currentWord.getmDefaultTranslation());

        // Find the TextView in the list_item.xml layout with the ID version_number
        TextView numberTextView = listItemView.findViewById(R.id.default_translation);
        // Get the version number from the current AndroidFlavor object and
        // set this text on the number TextView
        numberTextView.setText(currentWord.getmMiwokTranslation());


        ImageView imageView = listItemView.findViewById(R.id.img);
        if(currentWord.hasImage())
        {
            imageView.setImageResource(currentWord.getmImageResourceId());
            imageView.setVisibility(View.VISIBLE);
        }
        else
            imageView.setVisibility(View.GONE);

        View textContainer = listItemView.findViewById(R.id.text_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        textContainer.setBackgroundColor(color);

        return listItemView;
    }
}
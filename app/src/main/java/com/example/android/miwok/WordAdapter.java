package com.example.android.miwok;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {
    private int mBackgroundColorID;

    /**
     * This is our own custom constructor (it doesn't mirror a superclass constructor).
     * The context is used to inflate the layout file, and the list is the data we want
     * to populate into the lists.
     *
     * @param context        The current context. Used to inflate the layout file.
     * @param wordList A List of AndroidFlavor objects to display in a list
     */
    public WordAdapter(Activity context, ArrayList<Word> wordList, int backgroundColorID){
        super(context, 0, wordList);
        mBackgroundColorID = backgroundColorID;
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc.)
     *
     * @param position The position in the list of data that should be displayed in the
     *                 list item view.
     * @param convertView The recycled view to populate.
     * @param parent The parent ViewGroup that is used for inflation.
     * @return The View for the position in the AdapterView.
     * */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        //Get the {@link word} object located at this position in the list
        Word currentWord = getItem(position);


        //Find the TextView in the list_item.xml layout with the ID version_name
        TextView miwokTextView = (TextView) listItemView.findViewById(R.id.miwok_text_view);
        //Get the version name from the current word object and
        //set this text on the name TextView
        miwokTextView.setText(currentWord.getMiwokTranslation());

        TextView defaultTextView = (TextView) listItemView.findViewById(R.id.default_text_view);
        defaultTextView.setText(currentWord.getDefaultTranslation());

        //Find the ImageView in the list_item.xml layout with the ID version_name
        ImageView image = (ImageView) listItemView.findViewById(R.id.image_view);
        if(currentWord.hasImage()){
            image.setImageResource(currentWord.getImageResourceId());
        }else{
            image.setVisibility(View.GONE);
        }

        //Set the color of the linearLayout based off what was passed in the constructor
        LinearLayout wordPairLayout = (LinearLayout) listItemView.findViewById(R.id.word_pair_linear_layout);
        wordPairLayout.setBackgroundResource(mBackgroundColorID);

        //return the whole list item layout(containing 2 TextViews)
        //so that it can be shown in the ListView
        return listItemView;
    }
}

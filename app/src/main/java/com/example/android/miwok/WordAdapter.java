package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class WordAdapter extends ArrayAdapter<Word> {


    //Resource ID for the background color for the list of words
    private  int mColorResourceId;

    public  WordAdapter(Activity context, ArrayList<Word> words,int ColorResourceId){
        //Here, we initialize the ArrayAdapter's  internal storage for the context and the list .
        //the second argument is used  when the ArrayAdapter is populating a single TextView.
        //Because this is a custom adapter for two TextViews and an ImageView ,the adapter is not
        // going to use this second argument, so,it can be any value.Here ,we used 0.
        super(context,0,words);
        mColorResourceId=ColorResourceId;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       //check if the existing view is being reused,otherwise inflate the view
        View listItemView=convertView;
        if(listItemView==null){
        listItemView= LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
    }
        // Get the {@link word} object located at this position int the list.
    Word currentWord=getItem(position);
        //find the TextView in the list_item.xml layout with the ID miwok_text_view.


    TextView miwokTextView =(TextView) listItemView.findViewById(R.id.miwok_text_view);
    //Get the Miwok translation from the currentWord object and set this text on the Miwok TextView.
    miwokTextView.setText(currentWord.getMiwokTranslation());


    //find the TextView in the list_item.xml layout with the ID default_text_view.
    TextView defaultTextView =(TextView) listItemView.findViewById(R.id.default_text_view);
    //Get the default translation from the currentWord object and set this text on the default TextView.
    defaultTextView.setText(currentWord.getDefaultTranslation());



    // find the ImageView int he list.item.xml with the Id image.
        ImageView imageView=(ImageView) listItemView.findViewById(R.id.image);
          //method for having an image or not.
        if(currentWord.hasImage()) {
            //get the image from the currentWord object and set this image to the  particular imageView.
            imageView.setImageResource(currentWord.getImageResoureceId());
            imageView.setVisibility(View.VISIBLE);
        }else{
            imageView.setVisibility(View.GONE);
        }

        //set the theme color for the list item
        View textContainer=listItemView.findViewById(R.id.text_container);
        //fine the color that resource ID map to
        int color = ContextCompat.getColor(getContext(),mColorResourceId);
        //set the background color to the text container view
        textContainer.setBackgroundColor(color);


    //Return hte whole list item layout(containing 2 TextView) so that it can be shown in the ListView
    return listItemView;
    }

}

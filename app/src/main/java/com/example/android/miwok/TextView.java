package com.example.android.miwok;

import android.content.Context;
import android.view.View;

/**
 * Displays text to the user.
 */
public class TextView extends View {

    // String value
    private String mText;

    // Text color of the text
    private int mTextColor;

    // Context of the app
    private Context mContext;

    /**
     * Constructs a new TextView with initial values for text and text color.
     */
    public TextView(Context context) {
        super(context);
        mText = "";
        mTextColor = 0;
        mContext = context;
    }

    /**
     * Sets the string value in the TextView.
     *
     * @param text is the updated string to be displayed.
     */
    public void setText(String text) {
        mText = text;
    }

    /**
     * Sets the text color of the TextView.
     *
     * @param color of text to be displayed.
     */
    public void setTextColor(int color) {
        mTextColor = color;
    }

    /**
     * Gets the string value in the TextView.
     *
     * @return current text in the TextView.
     */
    public String getText() {
        return mText;
    }

    /**
     * Gets the text color of the TextView.
     *
     * @return current text color.
     */
    public int getTextColor() {
        return mTextColor;
    }
}
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

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create an ArrayList of Word objects
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("One ","Lutti",R.drawable.number_one));
        words.add(new Word("Two","Otiiko",R.drawable.number_two));
        words.add(new Word("Three ","Tolooksu",R.drawable.number_three));
        words.add(new Word("Four ","Oyyisa",R.drawable.number_four));
        words.add(new Word("Five ","Massokka",R.drawable.number_five));
        words.add(new Word("Six ","Temmoka",R.drawable.number_six));
        words.add(new Word("Seven ","Kenekaku",R.drawable.number_seven));
        words.add(new Word("Eight ","Kawinta",R.drawable.number_eight));
        words.add(new Word("Nine ","Wo'e",R.drawable.number_nine));
        words.add(new Word("Ten","Na'aacha",R.drawable.number_ten));

        // Create an {@link WordAdapter}, whose data source is a list of
        // {@link WordAdapter}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_numbers);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);

    }
}

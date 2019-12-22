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

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create an ArrayList of Word objects
        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?\n ","minto wuksus\n"));
        words.add(new Word("What is your name?\n","tinnә oyaase'nә\n"));
        words.add(new Word("My name is...\n ","oyaaset"));
        words.add(new Word("How are you feeling?\n ","michәksәs"));
        words.add(new Word("I’m feeling good.\n ","kuchi achit\n"));
        words.add(new Word("Are you coming?\n ","әәnәs'aa?\n"));
        words.add(new Word("Yes, I’m coming.\n ","hәә’ әәnәm\n"));
        words.add(new Word("I’m coming.\n ","әәnәm"));
        words.add(new Word("Let’s go.\n ","yoowutis"));
        words.add(new Word("Come here.\n","әnni'nem"));

        // Create an {@link WordAdapter}, whose data source is a list of
        // {@link WordAdapter}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

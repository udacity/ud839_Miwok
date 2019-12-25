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

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create an ArrayList of Word objects
        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you going?\n ","minto wuksus\n",R.raw.phrase_where_are_you_going));
        words.add(new Word("What is your name?\n","tinnә oyaase'nә\n",R.raw.phrase_what_is_your_name));
        words.add(new Word("My name is...\n ","oyaaset",R.raw.phrase_my_name_is));
        words.add(new Word("How are you feeling?\n ","michәksәs",R.raw.phrase_how_are_you_feeling));
        words.add(new Word("I’m feeling good.\n ","kuchi achit\n",R.raw.phrase_im_feeling_good));
        words.add(new Word("Are you coming?\n ","әәnәs'aa?\n",R.raw.phrase_are_you_coming));
        words.add(new Word("Yes, I’m coming.\n ","hәә’ әәnәm\n",R.raw.phrase_yes_im_coming));
        words.add(new Word("I’m coming.\n ","әәnәm",R.raw.phrase_im_coming));
        words.add(new Word("Let’s go.\n ","yoowutis",R.raw.phrase_lets_go));
        words.add(new Word("Come here.\n","әnni'nem",R.raw.phrase_come_here));

        // Create an {@link WordAdapter}, whose data source is a list of
        // {@link WordAdapter}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                mMediaPlayer = MediaPlayer.create(PhrasesActivity.this,word.getAudioResourceId());
                mMediaPlayer.start(); // no need to call prepare(); create() does that for you
            }
        });
    }
}

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

public class FamilyActivity extends AppCompatActivity {
    MediaPlayer mMediaPlayer;
    private MediaPlayer.OnCompletionListener mCompletionListener=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mp) {
            releaseMediaPlayer();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);
        // Create an ArrayList of Word objects
       final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("father ", "әpә", R.drawable.family_father,R.raw.family_father));
        words.add(new Word("mother", "әṭa", R.drawable.family_mother,R.raw.family_mother));
        words.add(new Word("son ", "angsi", R.drawable.family_son,R.raw.family_son));
        words.add(new Word("daughter ", "tune", R.drawable.family_daughter,R.raw.family_daughter));
        words.add(new Word("older brother\n ", "taachi", R.drawable.family_older_brother,R.raw.family_older_brother));
        words.add(new Word("younger brother\n ", "chalitti", R.drawable.family_younger_brother,R.raw.family_younger_brother));
        words.add(new Word("older sister\n ", "teṭe", R.drawable.family_older_sister,R.raw.family_older_sister));
        words.add(new Word("younger sister\n ", "kolliti", R.drawable.family_younger_sister,R.raw.family_younger_sister));
        words.add(new Word("grandmother\n ", "ama", R.drawable.family_grandmother,R.raw.family_grandmother));
        words.add(new Word("grandfather ", "paapa", R.drawable.family_grandfather,R.raw.family_grandfather));

        // Create an {@link WordAdapter}, whose data source is a list of
        // {@link WordAdapter}s. The adapter knows how to create list item views for each item
        // in the list.
        WordAdapter adapter = new WordAdapter(this, words,R.color.category_family);
        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Word word=words.get(position);
                //release the media player if it currently exist
                //because we are about to play a different sound file
                releaseMediaPlayer();
                mMediaPlayer = MediaPlayer.create(FamilyActivity.this,word.getAudioResourceId());
                mMediaPlayer.start(); // no need to call prepare(); create() does that for you
                //Setup a Listener on the media player, so that we can stop
                // and release the media player once the sound has finished player.
                mMediaPlayer.setOnCompletionListener(mCompletionListener);
            }
        });
    }
    /**
     * Clean up the media player by releasing its resources.
     */
    private void releaseMediaPlayer() {
        // If the media player is not null, then it may be currently playing a sound.
        if (mMediaPlayer != null) {
            // Regardless of the current state of the media player, release its resources
            // because we no longer need it.
            mMediaPlayer.release();

            // Set the media player back to null. For our code, we've decided that
            // setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer = null;
        }
    }
}

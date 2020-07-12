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

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create a list of words
        ArrayList<String> words = new ArrayList<String>();
        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        LinearLayout rootView =(LinearLayout)findViewById(R.id.rootView);

        int index = 0;

        TextView wordView = new TextView(this);
        wordView.setText(words.get(0));
        rootView.addView(wordView);

        index =index + 1;

        TextView wordView2 = new TextView(this);
        wordView2.setText(words.get(1));
        rootView.addView(wordView2);

        index =index + 1;


        TextView wordView3 = new TextView(this);
        wordView3.setText(words.get(2));
        rootView.addView(wordView3);

        index =index + 1;


        TextView wordView4 = new TextView(this);
        wordView4.setText(words.get(3));
        rootView.addView(wordView4);

        index =index + 1;


        TextView wordView5 = new TextView(this);
        wordView5.setText(words.get(4));
        rootView.addView(wordView5);

        index =index + 1;


        TextView wordView6 = new TextView(this);
        wordView6.setText(words.get(5));
        rootView.addView(wordView6);

        index =index + 1;


        TextView wordView7 = new TextView(this);
        wordView7.setText(words.get(6));
        rootView.addView(wordView7);

        index =index + 1;


        TextView wordView8 = new TextView(this);
        wordView8.setText(words.get(7));
        rootView.addView(wordView8);

        index =index + 1;


        TextView wordView9 = new TextView(this);
        wordView9.setText(words.get(8));
        rootView.addView(wordView9);

        index =index + 1;


        TextView wordView10 = new TextView(this);
        wordView10.setText(words.get(9));
        rootView.addView(wordView10);
    }
}

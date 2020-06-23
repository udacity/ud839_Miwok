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

public class aKatakanaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("a", "ア"));
        words.add(new Word("ka", "カ"));
        words.add(new Word("sa", "サ"));
        words.add(new Word("ta", "タ"));
        words.add(new Word("na", "ナ"));
        words.add(new Word("ha", "ハ"));
        words.add(new Word("ma", "マ"));
        words.add(new Word("ya", "ヤ"));
        words.add(new Word("ra", "ラ"));
        words.add(new Word("wa", "ワ"));


        WordAdaptor adapter = new WordAdaptor(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}

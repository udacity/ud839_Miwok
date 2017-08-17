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

        ArrayList<Word> words = new ArrayList<>();
        words.add(new Word("one", "lutti"));
        words.add(new Word("two", "otiiko"));
        words.add(new Word("three", "tolookosu"));
        words.add(new Word("four", "oyyisa"));
        words.add(new Word("five", "massokka"));
        words.add(new Word("six", "temmokka"));
        words.add(new Word("seven", "kenekaku"));
        words.add(new Word("eight" , "kawinta"));
        words.add(new Word("nine" , "wo'e"));
        words.add(new Word("ten", "na'aacha"));

        WordAdapter wordAdapter = new WordAdapter(this, words);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(wordAdapter);

       /* LinearLayout rootView =  (LinearLayout)findViewById(R.id.rootView);
        for (int i=0;i<words.size();i++)
        {
            TextView wordView = new TextView(this);
            wordView.setText(words.get(i));
            rootView.addView(wordView);
        }*/

        /*int cont = 0;
        while (cont<words.size()){
            TextView wordView = new TextView(this);
            wordView.setText(words.get(cont));
            rootView.addView(wordView);
            cont++;
        }*/
    }
}

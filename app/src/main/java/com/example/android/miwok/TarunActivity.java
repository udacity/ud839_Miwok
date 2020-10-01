package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class TarunActivity extends AppCompatActivity {

    private  MediaPlayer mMediaPlayer;

    private MediaPlayer.OnCompletionListener mCompleteListener=new MediaPlayer.OnCompletionListener() {
        @Override
        public void onCompletion(MediaPlayer mediaPlayer) {
            releaseMediaPlayer();

        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ///we are doing that to create object of your custom class Word
//        Word w=new Word("one","lutti");
//        words.add(w);
        //here we can use the array but when we declare it,its size cannot be changed so for dynamic property we use arraylist



        //create the array of words
        final ArrayList<Word> words=new ArrayList<Word>();
        words.add(new Word("ANIL BHATRA","baabu baachi",R.drawable.family_father,R.raw.anil_bhatra));
        words.add(new Word("SHIVAM BHATRA","Tangai chal ri cha abar",R.drawable.family_mother,R.raw.shivam_bhatra));
        words.add(new Word("AASHISH RAIKA","chal be, haath be",R.drawable.family_son,R.raw.aashish_raika));
        words.add(new Word("SHIVAM JOGANI","disha janeman ",R.drawable.family_daughter,R.raw.shivam_jogani));
        words.add(new Word("SHUBHAM KABRA","shuhelam kalora",R.drawable.family_older_brother,R.raw.shubham_kabra));
        words.add(new Word("SHIVAM AGARWAL","majnu",R.drawable.family_younger_brother,R.raw.shivam_agarwal));
        words.add(new Word("VASU GOYAL","fantasy league ke baadshah",R.drawable.family_older_sister,R.raw.vasu_goyal));
        words.add(new Word("HARSH VARDHAN SHEKHAWAT","only banna of your group",R.drawable.family_younger_sister,R.raw.harsh_vardhan));
        words.add(new Word("AAYUSH BHARGAV","bhai bt mt de yrr",R.drawable.family_grandfather,R.raw.aayush_bhargav));
        words.add(new Word("DEEPAK CHOUDHARY"," i have a solution",R.drawable.family_grandmother,R.raw.deepak_choudhary));


        //create an { @link wordadapter},whose data source is a list of
        //adapter knows how to create list items for each item in the
        WordAdapter adapter=new WordAdapter(this,words,R.color.category_tarun);
        //find the {@link listview} object in the view hierarchy of the list
        //There should be a { @ link listview} with the id called
        // word_list.xml layout file
        ListView listView =(ListView) findViewById(R.id.list);
        //Make the {@link listview use the {@link wordadapter} we create
        //{@link listview } will display list items for each {@link word}
        listView.setAdapter(adapter);



        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                //Toast.makeText(NumbersActivity.this,"List ITem Clicked",Toast.LENGTH_SHORT).show();
                //Get the {@link word} object at the given position the user clicked on
                Word word=words.get(position);

                // Release the media player if it currently exists because we about to play a different sound file
                releaseMediaPlayer();
                //Create and setup the {@link MediaPlayer} for the audio resource associated
                // with the current word
                mMediaPlayer=MediaPlayer.create(TarunActivity .this,word.getmAudioResoureceId());

                //start the audio file
                mMediaPlayer.start();   //don't need to call prepare ;create do that task for you

                //Setup a listener on the media player ,so that we can stop and release the
                //media player when the sound has finished playing
                mMediaPlayer.setOnCompletionListener(mCompleteListener);

            }
        });

    }


    @Override
    protected void onStop() {
        super.onStop();
        //when the activity is stopped ,release the media player resource because we won't
        //be playing any sound more
        releaseMediaPlayer();
    }
    /**
     * clean up the media player by releasing its resource
     */
    private void releaseMediaPlayer(){

        // If the media player is not null,then it may be currently playing a sound
        if(mMediaPlayer!=null){
            //Regardless of the current state of the media player,release,release its resource
            //because we no longer need it.
            mMediaPlayer.release();

            //Set the media player player back to null.For our code, we've decided that
            //setting the media player to null is an easy way to tell that the media player
            // is not configured to play an audio file at the moment.
            mMediaPlayer=null;
        }
    }
}
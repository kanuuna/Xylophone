package com.example.xylophone;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    //Creating sound variables.. These hold SoundPool objects
    //Empty vars are commonly denoted with a small m
    //First create an empty soundpool object. Because we define it at the highest execution
    //context, the variable can be used many times without problems with reassignment
    SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Creating a new soundpool object by assigning it to the var created on ln 14
        mSoundPool = new SoundPool(7 , AudioManager.STREAM_MUSIC , 0);

        //Assigning soundIds to variables via load method
        mCSoundId = mSoundPool.load(getApplicationContext() , R.raw.note1_c , 1);
        mDSoundId = mSoundPool.load(getApplicationContext() , R.raw.note2_d , 1);
        mESoundId = mSoundPool.load(getApplicationContext() , R.raw.note3_e , 1);
        mFSoundId = mSoundPool.load(getApplicationContext() , R.raw.note4_f , 1);
        mGSoundId = mSoundPool.load(getApplicationContext() , R.raw.note5_g , 1);
        mASoundId = mSoundPool.load(getApplicationContext() , R.raw.note6_a, 1);
        mBSoundId = mSoundPool.load(getApplicationContext() , R.raw.note7_b , 1);

        /*
        //Variable assignment
        Button button1 = (Button) findViewById(R.id.button7);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        Button button2 = (Button) findViewById(R.id.button6);
        Button button3 = (Button) findViewById(R.id.button5);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button3);
        Button button6 = (Button) findViewById(R.id.button2);
        Button button7 = (Button) findViewById(R.id.button);

        final int[] soundArray = {
                
        */









    }

    public void playC(View v) {
        //This code is executed when the C-button is pressed
        Log.d("Xylophone" , "Red button pressed");
        mSoundPool.play(mCSoundId , 1.0f , 1.0f , 1 , 0 , 1.0f);
    }

    public void playD(View v) {
        mSoundPool.play(mDSoundId , 1.0f , 1.0f , 1 , 0 , 1.0f);
    }

    public void playE(View v) {
        mSoundPool.play(mESoundId , 1.0f , 1.0f , 1 , 0 , 1.0f);
    }

    public void playF(View v) {
        mSoundPool.play(mFSoundId , 1.0f , 1.0f , 1 , 0 , 1.0f);
    }

    public void playG(View v) {
        mSoundPool.play(mGSoundId , 1.0f , 1.0f , 1 , 0 , 1.0f);
    }

    public void playA(View v) {
        mSoundPool.play(mASoundId , 1.0f , 1.0f , 1 , 0 , 1.0f);
    }

    public void playB(View v) {
        mSoundPool.play(mBSoundId , 1.0f , 1.0f , 1 , 0 , 1.0f);
    }
}
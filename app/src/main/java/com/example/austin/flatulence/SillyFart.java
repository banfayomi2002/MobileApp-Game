package com.example.austin.flatulence;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class SillyFart extends AppCompatActivity {

    private String position;
    private TextView et;
    MediaPlayer mediaPlayer;
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_silly_fart);
        et = (TextView)findViewById(R.id.sillyFattext);

        b1= (Button) findViewById(R.id.button3);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SillyFart.this,MainActivity.class);

                startActivity(i);
            }
        });
        SharedPreferences settings = getSharedPreferences("state", Context.MODE_PRIVATE);
        //flag for the radio buttons

        position = settings.getString("name",null);

        et.setText(position);



        mediaPlayer = MediaPlayer.create(SillyFart.this,R.raw.silly);

        mediaPlayer.start();


    }
}

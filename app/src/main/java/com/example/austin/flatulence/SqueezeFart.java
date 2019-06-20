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

public class SqueezeFart extends AppCompatActivity {

    private MediaPlayer mediaPlayer;
    String txtName,position;
    TextView et;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_squeeze_fart);
        b1= (Button) findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(SqueezeFart.this,MainActivity.class);

                startActivity(i);
            }
        });
        et = (TextView)findViewById(R.id.textView);

        SharedPreferences settings = getSharedPreferences("state", Context.MODE_PRIVATE);
        //flag for the radio buttons

        position = settings.getString("name",null);

        et.setText(position);

        // mediaPlayer.stop();
        mediaPlayer = MediaPlayer.create(SqueezeFart.this,R.raw.squeeze);

        mediaPlayer.start();


        //Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
    }
}

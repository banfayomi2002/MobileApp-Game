package com.example.austin.flatulence;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class About extends AppCompatActivity {
    Button b1;
    TextView et;
    private final String about= " Application Name: Flatulence" + '\n'+
            " Coder: Augustine Fayomi" + '\n'
            + " Purpose: Plays fart different sounds according to the type chosen from the list " + '\n'
            +" Sensor: Multitouch - Action Down, Action Move was used on the Main page and Action Down on the Fart List" + '\n'+
            " Shared Preference: The Fart type selected and location is shared" + '\n'
            +" Sounds: Common Fart sound, silly fart sound, squeeze fart sound " + '\n'+
            " No of Images: 3 pictures were used to depict the three types of farts sounds used. " + '\n'
            +" Version: 1.0.0";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        et = (TextView)findViewById(R.id.aboutTxt);
        et.setText(about);
        b1=(Button)findViewById(R.id.mainPage);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(About.this,MainActivity.class);

                startActivity(i);
            }
        });
    }
}

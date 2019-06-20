package com.example.austin.flatulence;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends AppCompatActivity {

    String position,secondPos, thirdPos;
    float lastXAxis = 0f;
    float lastYAxis = 0f;
    float xAxis = 0f;
    float yAxis = 0f;

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1= (Button) findViewById(R.id.aboutLink);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this,About.class);

                startActivity(i);
            }
        });
        ImageView img = (ImageView) findViewById(R.id.mainImg);
      img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int actionPeformed = event.getAction();

                switch(actionPeformed){
                    case MotionEvent.ACTION_DOWN:{

                        Intent i = new Intent(MainActivity.this,FartList.class);
                        startActivity(i);
                        break;
                    }

                    case MotionEvent.ACTION_MOVE:{

                        Intent i = new Intent(MainActivity.this,FartList.class);
                        startActivity(i);
                        break;
                    }

                }
                return true;
            }
        });
    }



    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences settings = getSharedPreferences("state", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = settings.edit();
        // songName=et.getText().toString();
        editor.putString("name",position);

        editor.commit();
    }
}


package com.example.austin.flatulence;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class FartList extends AppCompatActivity {

    String position,secondPos, thirdPos;
    float lastXAxis = 0f;
    float lastYAxis = 0f;
    float xAxis = 0f;
    float yAxis = 0f;

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fart_list);

        ImageView img = (ImageView) findViewById(R.id.babeImg);
        img.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int actionPeformed = event.getAction();

                switch(actionPeformed){
                    case MotionEvent.ACTION_DOWN:{
                        final float x = event.getX();
                        final float y = event.getY();
                        lastXAxis = x;
                        lastYAxis = y;

                        position = " You Selected Common Fart at"+'\n'+" X:" +Float.toString(x) + " Y: "+Float.toString(y)+'\n';

                        Intent i = new Intent(FartList.this,SqueezeFart.class);
                        i.putExtra("name", position);

                        startActivity(i);
                        break;
                    }


                    //
                }
                return true;
            }
        });

        ImageView img2 = (ImageView) findViewById(R.id.imagesilly);
        img2.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int actionPeformed = event.getAction();

                switch(actionPeformed){
                    case MotionEvent.ACTION_DOWN:{
                        final float x = event.getX();
                        final float y = event.getY();
                        lastXAxis = x;
                        lastYAxis = y;

                        position = " You Selected Silly Fart at "+'\n'+"X:" +Float.toString(x) + " Y: "+Float.toString(y)+'\n';

                        Intent i = new Intent(FartList.this,SillyFart.class);
                        i.putExtra("name", position);

                        startActivity(i);
                        break;
                    }


                    //
                }
                return true;
            }
        });

        ImageView img3 = (ImageView) findViewById(R.id.imagedog);
        img3.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                final int actionPeformed = event.getAction();

                switch(actionPeformed){
                    case MotionEvent.ACTION_DOWN:{
                        final float x = event.getX();
                        final float y = event.getY();
                        lastXAxis = x;
                        lastYAxis = y;

                        position = " You Selected Squeeze Fart at "+'\n'+"X:" +Float.toString(x) + " Y: "+Float.toString(y) +'\n';

                        Intent i = new Intent(FartList.this,CommonFart.class);
                        i.putExtra("name", position);

                        startActivity(i);
                        break;
                    }

                    //
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

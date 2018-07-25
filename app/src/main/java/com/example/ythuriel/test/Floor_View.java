package com.example.ythuriel.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Floor_View extends AppCompatActivity implements View.OnClickListener{
    private ImageView floorimage;
    private ImageButton upbutton, downbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor__view);

        upbutton = findViewById(R.id.upbutton);
        downbutton = findViewById(R.id.downbutton);
        floorimage = findViewById(R.id.floorimage);
        downbutton.setOnClickListener(this);
        upbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.equals(upbutton)){
            //floorimage.setImageResource(R.drawable.numerbudynku.numerpietra);    //ustawienie obrazu wyzszego pietra
        }
        else if (view.equals(downbutton)){
            //floorimage.setImageResource(R.drawable.numerbudynku.numerpietra);    //ustawienie obrazu nizszego pietra
        }
    }
}

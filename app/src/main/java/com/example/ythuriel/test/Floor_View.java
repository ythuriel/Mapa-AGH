package com.example.ythuriel.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class Floor_View extends AppCompatActivity implements View.OnClickListener{
    private ImageView floorimage;
    private ImageButton upbutton, downbutton;
    private String budynek;
    private int pietro=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor__view);

        budynek = getIntent().getStringExtra("budynek");
        upbutton = findViewById(R.id.upbutton);
        downbutton = findViewById(R.id.downbutton);
        floorimage = findViewById(R.id.floorimage);
        floorimage.setImageResource(getResources().getIdentifier("startup", "drawable", getPackageName()));
        downbutton.setOnClickListener(this);
        upbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.equals(upbutton)){ //pliki z planami pieter musza byc zapisane w formacie kodbudynku_pietro np. B2_1 B2_3
            pietro++;
            floorimage.setImageResource(getResources().getIdentifier(budynek+"_"+pietro, "drawable", getPackageName()));
        }
        else if (view.equals(downbutton)){
            pietro--;
            floorimage.setImageResource(getResources().getIdentifier(budynek+"_"+pietro, null, null));
        }
    }
}

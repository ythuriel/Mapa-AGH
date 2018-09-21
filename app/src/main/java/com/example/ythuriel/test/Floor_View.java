package com.example.ythuriel.test;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class Floor_View extends AppCompatActivity implements View.OnClickListener{
    private TextView textView;
    private ImageView floorimage;
    private ImageButton upbutton, downbutton;
    private String budynek, Text;
    private int pietro=50;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_floor__view);

        budynek = getIntent().getStringExtra("budynek").toLowerCase();
        upbutton = findViewById(R.id.upbutton);
        downbutton = findViewById(R.id.downbutton);
        floorimage = findViewById(R.id.floorimage);
        textView = findViewById(R.id.textView);
        floorimage.setImageResource(getResources().getIdentifier(budynek + "_" + pietro, "drawable", getPackageName()));
        Text="pietro "+(pietro-50);
        textView.setText(Text.toCharArray(),0,Text.length());
        downbutton.setOnClickListener(this);
        upbutton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        if (view.equals(upbutton)) { //pliki z planami pieter musza byc zapisane w formacie kodbudynku_pietro np. b2_51 b2_53 (do numeru pietra +50)
            if (getResources().getIdentifier(budynek + "_" + (pietro + 1), "drawable", getPackageName()) != 0){
                pietro++;
                floorimage.setImageResource(getResources().getIdentifier(budynek + "_" + pietro, "drawable", getPackageName()));
                Text="pietro "+(pietro-50);
                textView.setText(Text.toCharArray(),0,Text.length());
            }
        }
        else if (view.equals(downbutton)){
            if (getResources().getIdentifier(budynek + "_" + (pietro - 1), "drawable", getPackageName()) != 0) {
                pietro--;
                floorimage.setImageResource(getResources().getIdentifier(budynek + "_" + pietro, "drawable", getPackageName()));
                Text="pietro "+(pietro-50);
                textView.setText(Text.toCharArray(),0,Text.length());
            }
        }
    }
}

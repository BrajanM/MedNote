package com.example.brajan.mednote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private Button nagranie;
    private Button notatka;
    private Button bazaDanych;
    private ImageButton offButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nagranie= (Button) findViewById(R.id.nagranie);
        notatka=(Button) findViewById(R.id.notatka);
        bazaDanych=(Button)findViewById(R.id.baza_danych);
        offButton=(ImageButton)findViewById(R.id.offButton);


        nagranie.setOnClickListener(onClick);
        bazaDanych.setOnClickListener(onClick2);
        offButton.setOnClickListener(onOffClick);
    }
    private View.OnClickListener onClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Main2Activity.class);
            MainActivity.this.startActivity(intent);





        }
    };
    private View.OnClickListener onClick2 = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this, Main4Activity.class);
            MainActivity.this.startActivity(intent);





        }
    };
    private View.OnClickListener onOffClick = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            finishAndRemoveTask ();

        }
    };


}

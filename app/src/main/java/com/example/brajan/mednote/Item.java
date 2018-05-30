package com.example.brajan.mednote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Item extends AppCompatActivity {




    private ImageButton wybierz;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item);

        wybierz=(ImageButton)findViewById(R.id.Wybierz);

        wybierz.setOnClickListener(onClick);
    }



    private View.OnClickListener onClick=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {

            Intent intent = new Intent(Item.this, Text.class);
           Item.this.startActivity(intent);




        }
    };
}

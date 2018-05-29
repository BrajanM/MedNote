package com.example.brajan.mednote;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    private Button cofnij;
    private Button nagraj;
    private TextView imie;
    private TextView nazwisko;
    private TextView tytul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        nagraj=(Button)findViewById(R.id.nagraj);
        cofnij=(Button)findViewById(R.id.cofnij);
        cofnij.setOnClickListener(onClick);
        nagraj.setOnClickListener(onClick2);

        imie=(TextView)findViewById(R.id.imie);
        nazwisko=(TextView)findViewById(R.id.nazwisko);
        tytul=(TextView)findViewById(R.id.tytuł);


    }
    private View.OnClickListener onClick=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {

            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            Main2Activity.this.startActivity(intent);
        }
    };
    private View.OnClickListener onClick2=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {

            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
            Main2Activity.this.startActivity(intent);


            // w tym miejscu zapisać dane pacjenta do bazy
        }
    };

}

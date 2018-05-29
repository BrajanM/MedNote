package com.example.brajan.mednote;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.speech.RecognizerIntent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.ButterKnife;



public class Main5Activity extends AppCompatActivity {
    private final int SPEECH_RECOGNITION_CODE = 1;
    private Button zapisz;



    public String text="";// wypowiedź do bazy danych


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ButterKnife.bind(this);


        startSpeechToText();


        zapisz=(Button)findViewById(R.id.Zapisz);
        zapisz.setOnClickListener(onClick);


    }

    private View.OnClickListener onClick=new View.OnClickListener()
    {
        @Override
        public void onClick(View view)
        {

            Intent intent = new Intent(Main5Activity.this, MainActivity.class);
            Main5Activity.this.startActivity(intent);


            // podpiąć tutaj zapis do bazy danych

        }
    };



    private void startSpeechToText() {
        Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE,"pl_PL");
        intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
                RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        intent.putExtra(RecognizerIntent.EXTRA_PROMPT,
                "Powiedz coś do mikrofonu...");

        try {
            startActivityForResult(intent, SPEECH_RECOGNITION_CODE);
        } catch (ActivityNotFoundException a) {
            Toast.makeText(getApplicationContext(),
                    "Przepraszamy! Twój telefon nie obsługuje rozpoznawania mowy.",
                    Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        switch (requestCode) {
            case SPEECH_RECOGNITION_CODE: {
                if (resultCode == RESULT_OK && null != data) {
                    ArrayList<String> result = data
                            .getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
                    text += " "+result.get(0);



                    startSpeechToText();


                }
                break;
            }
        }
    }
}

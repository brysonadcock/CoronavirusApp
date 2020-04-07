package edu.augustana.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class DiagnoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnose);

        Button feverBtn =findViewById(R.id.feverBtn);
        Button coughBtn =findViewById(R.id.coughBtn);
        Button shortBreathBtn =findViewById(R.id.shortBreathBtn);
        Button muscleAcheBtn = findViewById(R.id.muscleAcheBtn);
        Button soreThroatBtn =findViewById(R.id.soreThroatBtn);
        Button Btn =findViewById(R.id.feverBtn);
    }
}

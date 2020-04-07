package edu.augustana.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DiagnoseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diagnose);
    }

    public void findResults(View view){
        Button feverBtn =findViewById(R.id.feverBtn);
        Button coughBtn =findViewById(R.id.coughBtn);
        Button shortBreathBtn =findViewById(R.id.shortBreathBtn);
        Button muscleAcheBtn = findViewById(R.id.muscleAcheBtn);
        Button soreThroatBtn =findViewById(R.id.soreThroatBtn);
        Button sensesBtn =findViewById(R.id.sensesBtn);
        TextView resultsView = findViewById(R.id.resultsView);

        //Get results from the survey
        String feverString = feverBtn.getText().toString();
        int fever = yesNoProcessor(feverString);
        String coughString = coughBtn.getText().toString();
        int cough = yesNoProcessor(coughString);
        String shortBreathString = shortBreathBtn.getText().toString();
        int shortBreath = yesNoProcessor(shortBreathString);
        String muscleAcheString = muscleAcheBtn.getText().toString();
        int muscleAche = yesNoProcessor(muscleAcheString);
        String soreThroatString = soreThroatBtn.getText().toString();
        int soreThroat = yesNoProcessor(soreThroatString);
        String sensesString = sensesBtn.getText().toString();
        int senses = yesNoProcessor(sensesString);

        int totalSymptoms = fever + cough + shortBreath + muscleAche + soreThroat + senses;
        String result = "";
        if (totalSymptoms >= 5) { // High Risk
            result = "You have a high probability of having coronavirus.  You meet exhibit almost all of the key symptoms. Contact your doctor about what steps you need to take next.";
        } else if (totalSymptoms >= 3) {
            result = "You meet exhibit almost all of the symptoms. Contact your doctor about what steps you need to take next.";
        } else if (totalSymptoms >=1) {
            result = "You meet exhibit almost all of the symptoms. Contact your doctor about what steps you need to take next.";
        } else {
            result = "You meet exhibit almost all of the symptoms. Contact your doctor about what steps you need to take next.";
        }
        resultsView.setText(result);
    }

    //Converts the string from the button text into an integer. Yes = 1, No = 0
    private int yesNoProcessor(String str) {
        if (str.equals("Yes")) {
            return 1;
        } else {
            return 0;
        }
    }
}

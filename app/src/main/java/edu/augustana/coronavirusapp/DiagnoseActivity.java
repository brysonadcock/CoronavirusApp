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
            result = "There is a high probability you have coronavirus.  You meet exhibit almost all of the key symptoms. Contact your doctor as soon as possible to talk about what steps you need to take next. Self-quarantine until you can talk to your doctor.";
        } else if (totalSymptoms >= 3) {
            result = "You meet exhibit several of the symptoms. If you are above the age of 60, immuno-compromised, or have asthma or other respiratory issues, you could be at risk.  It is advised to contact your doctor about what steps to take next. If you are not in an at risk group, self-quarantine until symptoms are gone. If your symptoms worsen, contact your doctor.";
        } else if (totalSymptoms >=1) {
            result = "You only show a couple of the symptoms for coronavirus. Monitor your symptoms to see if they get worse or if you develop more symptoms. Until symptoms go away, it is advised to self-quarantine to prevent potential spread to others.";
        } else {
            result = "You don't meet any of the symptoms of coronavirus. It is still advised you practice social distancing to continue to stay healthy.";
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

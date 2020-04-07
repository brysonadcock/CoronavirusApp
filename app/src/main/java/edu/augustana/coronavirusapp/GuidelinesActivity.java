package edu.augustana.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class GuidelinesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guidelines);

        // Sets the text in the two lists on the page
        TextView seekHelpView = findViewById(R.id.seekHelpView);
        TextView tipsToStayHealthyList = findViewById(R.id.tipsToStayHealthyList);
        seekHelpView.setText("Seek Medical Attention if you exhibit the following:\n  •  Difficulty breathing\n  •  Persistent chest or pressure\n  •  Bluish Lips of Face\n");
        tipsToStayHealthyList.setText("How To Protect Yourself:\n  •  Avoid close contact with others (6ft of space)\n  • Wash your hands often and after going in public\n  •  Cover your mouth and nose when around others\n  •  Cover coughs and sneezes\n  •  Clean and disinfect surfaces and phones daily\n  •  Stay home unless getting food, medicine, or exercise\n");
    }

}

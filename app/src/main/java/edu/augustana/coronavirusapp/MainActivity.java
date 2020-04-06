package edu.augustana.coronavirusapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "edu.augustana.coronavirusapp.MESSAGE";

//    private Button diagnoseHelpBtn = findViewById(R.id.diagnoseHelpBtn);
//    private Button symptomsBtn = findViewById(R.id.symptomsBtn);
//    private Button cdcWebBtn = findViewById(R.id.cdcWebBtn);
//    private Button usCaseMapSiteBtn = findViewById(R.id.usCaseMapSiteBtn);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        Button diagnoseHelpBtn = findViewById(R.id.diagnoseBtn);
//        Button symptomsBtn = findViewById(R.id.symptomsBtn);
//        Button cdcWebBtn = findViewById(R.id.cdcWebBtn);
//        Button usCaseMapSiteBtn = findViewById(R.id.usCaseMapSiteBtn);
    }

    public void goToDiagnosisActivity(View view) {
        Intent intent = new Intent(this, DiagnoseActivity.class);
        startActivity(intent);
    }

    public void goToSymptomsActivity(View view) {
        Intent intent = new Intent(this, SymptomsActivity.class);
        startActivity(intent);
    }

    public void goToWebViewActivity(View view) {
        Intent intent = new Intent(this, WebViewActivity.class);
        startActivity(intent);
    }

    public void goToSite(View view) {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_VIEW);
        intent.addCategory(Intent.CATEGORY_BROWSABLE);
        intent.setData(Uri.parse("https://www.cdc.gov/coronavirus/2019-nCoV/index.html"));
        startActivity(intent);
    }

    public void goToCredits(View view) {
        Intent intent = new Intent(this, CreditsActivity.class);
//        TextView menuText = findViewById(R.id.menuTextView);
//        String message = menuText.getText().toString();
//        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
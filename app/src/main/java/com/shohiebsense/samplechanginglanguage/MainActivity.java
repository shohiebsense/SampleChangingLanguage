package com.shohiebsense.samplechanginglanguage;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private String translation;
    SharedPreferences preferences;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        preferences = PreferenceManager.getDefaultSharedPreferences(this);
        translation = preferences.getString(this
                .getString(R.string.com_shohiebsense_samplechanginglanguage_strings_DEFAULT_TRANSLATION), "en");


        Button a = (Button) findViewById (R.id.button1);

        if(translation.equals("in")){
            a.setText(this.getString(R.string.change_language_id));
        }
        else {
            a.setText(this.getString(R.string.change_language));
        }
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), SettingActivity.class));
            }
        });
    }




}

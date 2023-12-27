package com.example.practical8;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {

    EditText ETBgColorCode;
    EditText ETImageNumber;

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        ETBgColorCode = findViewById(R.id.ETBgColorCode);
        ETImageNumber = findViewById(R.id.ETImageNumber);

        SharedPreferences SharedPref = this.getPreferences(Context.MODE_PRIVATE);
        String SPBgColorCode = SharedPref.getString("BgColorCode", "");
        int SPImageNumber = SharedPref.getInt("ImageNumber", 3);

        ETBgColorCode.setText(SPBgColorCode);
        ETImageNumber.setText(String.valueOf(SPImageNumber));
    }

    public void BtnSubmitSettingsOnClick (View v){
        SharedPreferences sharedPreferences = this.getPreferences(Context.MODE_PRIVATE);

        SharedPreferences.Editor SPEditor = sharedPreferences.edit();

        String BgColorCode = ETBgColorCode.getText().toString();
        Integer ImageNumber = Integer.parseInt(ETImageNumber.getText().toString());

        SPEditor.putString("BgColorCode", BgColorCode);
        SPEditor.putInt("ImageNumber", ImageNumber);

        SPEditor.commit();
    }
}

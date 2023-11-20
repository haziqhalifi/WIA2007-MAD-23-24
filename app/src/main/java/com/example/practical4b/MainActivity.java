package com.example.practical4b;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.widget.Button;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import android.graphics.drawable.ColorDrawable;

public class MainActivity extends AppCompatActivity {

    private CheckBox CBRed;
    private CheckBox CBGreen;
    private CheckBox CBBlue;
    private ConstraintLayout CSLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CBRed = findViewById(R.id.CBRed);
        CBGreen = findViewById(R.id.CBGreen);
        CBBlue = findViewById(R.id.CBBlue);
        CSLayout = findViewById(R.id.CLayoutCS);

        final Button BtnSubmit = findViewById(R.id.BtnSubmit);
        BtnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (CBRed.isChecked()) {
                    CSLayout.setBackgroundColor(Color.RED);
                } else if (CBGreen.isChecked()) {
                    CSLayout.setBackgroundColor(Color.GREEN);
                } else {
                    CSLayout.setBackgroundColor(Color.BLUE);
                }
            }
        });
    }
}
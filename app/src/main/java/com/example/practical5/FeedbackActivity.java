package com.example.practical5;

import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import android.widget.Button;
import android.widget.TextView;
import android.os.Bundle;
import android.widget.EditText;
public class FeedbackActivity extends AppCompatActivity{

    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback);

        //Connect with UI Widget RateBarFeedback, TVRating, ETFeedback, BTNFeedback
        RatingBar RateBarFeedback = findViewById(R.id.RateBarFeedback);
        TextView TVRating = findViewById(R.id.TVRating);
        EditText ETFeedback = findViewById(R.id.ETFeedback);
        Button BTNFeedback = findViewById(R.id.BTNFeedback);

        //The Button onCreateListener to toast a message and share the cashback code is user has entered the feedback
        BTNFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                String message = "Thank you for your feedback!";
                if(ETFeedback.getText().toString().isEmpty())
                    message = message + "Please enjoy your RM5 Cashback: ABC123";
                Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
            }
        });

        RateBarFeedback.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                TVRating.setText("You have rated "+rating);
            }
        });
    }
}

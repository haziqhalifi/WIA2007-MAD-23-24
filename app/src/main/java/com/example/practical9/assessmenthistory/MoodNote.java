package com.example.practical9.assessmenthistory;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

//1. Room will use these data to create a table in sqlite database
@Entity
public class MoodNote {
    @PrimaryKey(autoGenerate = true)
    public int mNoteID;

    public String mDate;
    public String mSubject;
    public int mScore;

    public MoodNote(@NonNull String date, @NonNull String subject, int score) {
        this.mDate = date;
        this.mSubject = subject;
        this.mScore = score;
    }

    public String getmDate() { return this.mDate; }
    public String getmSubject() { return this.mSubject; }
    public int getmScore() { return this.mScore; }
}

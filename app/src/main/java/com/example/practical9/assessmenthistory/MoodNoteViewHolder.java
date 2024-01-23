package com.example.practical9.assessmenthistory;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.practical9.R;

class MoodNoteViewHolder extends RecyclerView.ViewHolder {
    private final TextView noteDate;
    private final TextView noteSubject;
    private final TextView noteScore;

    private MoodNoteViewHolder(View itemView) {
        super(itemView);

        noteDate = itemView.findViewById(R.id.TVDate);
        noteSubject = itemView.findViewById(R.id.TVSubjectContent);
        noteScore = itemView.findViewById(R.id.TVScoreContent);
    }

    public void bind(String date, String subject, int score) {
        noteDate.setText(date);
        noteSubject.setText(subject);
        noteScore.setText(String.valueOf(score));
    }

    static MoodNoteViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.individual_item_view, parent, false);
        return new MoodNoteViewHolder(view);
    }
}

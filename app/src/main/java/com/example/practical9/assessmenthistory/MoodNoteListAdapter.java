package com.example.practical9.assessmenthistory;

import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.ListAdapter;

public class MoodNoteListAdapter extends ListAdapter<MoodNote, MoodNoteViewHolder> {

    public MoodNoteListAdapter(@NonNull DiffUtil.ItemCallback<MoodNote> diffCallback) {
        super(diffCallback);
    }

    @Override
    public MoodNoteViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return MoodNoteViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(MoodNoteViewHolder holder, int position) {
        MoodNote current = getItem(position);
        holder.bind(current.getmDate(), current.getmSubject(), current.getmScore());
    }

    static class NoteDiff extends DiffUtil.ItemCallback<MoodNote> {

        @Override
        public boolean areItemsTheSame(@NonNull MoodNote oldItem, @NonNull MoodNote newItem) {
            return oldItem == newItem;
        }

        @Override
        public boolean areContentsTheSame(@NonNull MoodNote oldItem, @NonNull MoodNote newItem) {
            return oldItem.getmDate().equals(newItem.getmDate())
                    && oldItem.getmSubject().equals(newItem.getmSubject())
                    && oldItem.getmScore() == newItem.getmScore();
        }
    }
}

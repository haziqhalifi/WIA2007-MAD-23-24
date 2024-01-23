package com.example.practical9.assessmenthistory;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import com.example.practical9.assessmenthistory.MoodNote;

import java.util.List;

//2. Create the DAO to access to MoodNote database
@Dao
public interface MoodNoteDao {
    // Existing methods...

    // New method to get notes by subject
    @Query("SELECT * FROM MoodNote WHERE mSubject = :subject ORDER BY mDate ASC")
    LiveData<List<MoodNote>> getNotesBySubject(String subject);
}

package com.example.theprogrammer.thejournalapp;

/**
 * Created by The Programmer on 25-6-2018.
 */

public class NoteModel {

    public String noteTitle;
    public String noteTime;


    public NoteModel(String noteTitle, String noteTime) {
        this.noteTitle = noteTitle;
        this.noteTime = noteTime;
    }

    public NoteModel(){

    }

    public String getNoteTitle() {
        return noteTitle;
    }

    public void setNoteTitle(String noteTitle) {
        this.noteTitle = noteTitle;
    }

    public String getNoteTime() {
        return noteTime;
    }

    public void setNoteTime(String noteTime) {
        this.noteTime = noteTime;
    }
}

package edu.examples.java_classes.dao.impl;

import edu.examples.java_classes.entity.Note;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FileNoteBook {
    private static List<Note> notes = new ArrayList<>();

    public static void add(Note n) {
        notes.add(n);
    }

    public static void delete(int ID) {

        for (int i = 0; i > notes.size(); i++) {
            if (notes.get(i).getId() == ID) {
                notes.remove(i);
            }
        }
    }

    public static void clear() {
        notes.clear();
    }

    public static List<Note> get() {
        return notes;
    }


    public static void sortNotes() {
        Collections.sort(notes);
    }

    public static int sizeOfNotes() {
        return notes.size();
    }
}

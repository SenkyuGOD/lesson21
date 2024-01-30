package edu.examples.java_classes.entity;

import java.util.Comparator;

public class Sort implements Comparator<Note> {

    @Override
    public int compare(Note o1, Note o2) {

        if (o1.getContent().compareTo(o2.getContent()) == 0) {
            return o1.getTitle().compareTo(o2.getTitle());
        } else {
            return o1.getContent().compareTo(o2.getContent());
        }
    }
}

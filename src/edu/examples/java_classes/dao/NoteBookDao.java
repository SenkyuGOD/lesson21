package edu.examples.java_classes.dao;

import java.util.Date;
import java.util.List;

import edu.examples.java_classes.entity.Note;

public interface NoteBookDao {

    void save(Note n) throws DaoException;

    void delete(int id) throws DaoException;

    void clear() throws DaoException;

    void update(Note n) throws DaoException;


    List<Note> allNotes() throws DaoException;

}

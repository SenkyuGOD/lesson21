package edu.examples.java_classes.dao.impl;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.examples.java_classes.dao.*;
import edu.examples.java_classes.entity.Note;


public class FileNoteBookDao implements NoteBookDao {

    @Override
    public void save(Note n) throws DaoException {

        if (n.getId() == 0) {
            n.setId(FileNoteBook.sizeOfNotes() + 1);
        }

        if (n.getDate() == null) {
            n.setDate(new Date());
        }

        try {
            FileNoteBook.add(n);
            SaveFile.dataFile(FileNoteBook.get());
        } catch (IOException e) {
            throw new DaoException(e);
        }

    }

    @Override
    public void delete(int id) throws DaoException {

        try {
            FileNoteBook.delete(id);
            SaveFile.dataFile(FileNoteBook.get());
        } catch (IOException e) {
            throw new DaoException(e);
        }

    }

    @Override
    public void clear() throws DaoException {
        try {
           FileNoteBook.clear();
            SaveFile.dataFile(FileNoteBook.get());
        } catch (IOException e) {
            throw new DaoException(e);
        }
    }


    @Override
    public List<Note> allNotes() throws DaoException {
        return null;
    }

}

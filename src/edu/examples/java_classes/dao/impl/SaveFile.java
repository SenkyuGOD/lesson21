package edu.examples.java_classes.dao.impl;

import edu.examples.java_classes.entity.Note;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.SimpleTimeZone;

public final class SaveFile {
    private SaveFile(){}

    private static final String FILE_NAME = "stub.txt";


    public static void  dataFile(List<Note> notes) throws IOException {
        FileWriter writer = new FileWriter(FILE_NAME, false);
        SimpleDateFormat format = new SimpleDateFormat("yyyy-mm-dd");


        for (Note s : notes) {
            writer.write("/Id=" + s.getId() +
                    "/Title=" + s.getTitle() +
                    "/Content=" + s.getContent() +
                    "/Date=" + format.format(s.getDate()));
            writer.append("\n");
        }

        writer.close();
    }
}

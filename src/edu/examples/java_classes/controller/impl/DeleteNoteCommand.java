package edu.examples.java_classes.controller.impl;

import edu.examples.java_classes.controller.Command;
import edu.examples.java_classes.entity.Note;
import edu.examples.java_classes.logic.LogicException;
import edu.examples.java_classes.logic.LogicProvider;
import edu.examples.java_classes.logic.NotebookLogic;

public class DeleteNoteCommand implements Command {

    private final LogicProvider logicProvider = LogicProvider.getInstance();
    private final NotebookLogic logic = logicProvider.getNotebookLogic();

    @Override
    public String execute(String request) {
        String response = null;
        String[] params;
        Note newNote;

        // validate request
        params = request.split("\n");
        newNote = new Note();
        newNote.setTitle(params[1].split("=")[1]);


        try {
            logic.delete(newNote.getId());
            response = "Запись успешно удалена.";
        } catch (LogicException e) {
            // log
            response = "Что-то пошло не так. Попробуйте еще раз.";
        }


        return response;
    }
}

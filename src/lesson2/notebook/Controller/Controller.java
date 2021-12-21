package lesson2.notebook.Controller;

import lesson2.notebook.Model.Entity.Notebook;
import lesson2.notebook.Model.NotebookService;
import lesson2.notebook.View.View;

import java.util.Scanner;

/**
 * Module Controller manges Notebook and View.
 *
 * @author Illia Smiian
 * @version 1.0
 * @since 2021-12-16
 */
public class Controller  {

    private final Notebook notebook;
    private final View view;


    /**
     * Initialize controller with new model of notebook and view
     *
     * @param notebook Class representing model notebook
     * @param view     Class representing view
     */
    public Controller(Notebook notebook, View view) {
        this.notebook = notebook;
        this.view = view;

    }


    /**
     * Starts initializing process of new object type of Notebook
     */
    public void userProcess() {

        NotebookService notebookService = new NotebookService(view, new Scanner(System.in));

        notebookService.inputNote();


    // view.printFullName(notebook);





    }

}

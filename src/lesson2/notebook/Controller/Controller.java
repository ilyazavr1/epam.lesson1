package lesson2.notebook.Controller;

import lesson2.notebook.Model.Entity.Notebook;
import lesson2.notebook.Model.Model;
import lesson2.notebook.Model.NotUniqueLoginException;
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
public class Controller {

    private final Model model;
    private final View view;


    /**
     * Initialize controller with new model of notebook and view
     *
     * @param model Class representing model
     * @param view     Class representing view
     */
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;

    }


    /**
     * Starts initializing process of new object type of Notebook
     */
    public void userProcess() {

        NotebookService notebookService = new NotebookService(view, new Scanner(System.in));
        notebookService.inputNote();

        Notebook notebook = newNotebook(notebookService);

        System.out.println(notebook);

    }

    public Notebook newNotebook(NotebookService notebookService) {
        Notebook notebook = null;

        while (true) {
            try {
                notebook = new Notebook(notebookService.getName(), notebookService.getLogin());
                break;
            } catch (NotUniqueLoginException e) {
                e.printStackTrace();
                System.out.println("Not Unique Login " + e.getLoginData());
                notebookService.inputLogin();
            }
        }

        return notebook;
    }

}

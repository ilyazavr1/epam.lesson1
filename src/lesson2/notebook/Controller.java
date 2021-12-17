package lesson2.notebook;

import java.util.Scanner;

/**
 * Module Controller manges Notebook and View.
 *
 * @author Illia Smiian
 * @version 1.0
 * @since 2021-12-16
 */
public class Controller implements TextConstants, RegexConstants {

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
        ScannerService scannerService = new ScannerService(view, new Scanner(System.in));

        notebook.setName(scannerService.inputValue(REQUIRE_NAME, REGEX_NAME));
        notebook.setSecondName(scannerService.inputValue(REQUIRE_SECOND_NAME, REGEX_SECOND_NAME));
        notebook.setSurname(scannerService.inputValue(REQUIRE_SURNAME, REGEX_SURNAME));

        view.printFullName(notebook);
    }

}

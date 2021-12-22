package lesson2.notebook;

import lesson2.notebook.Controller.Controller;
import lesson2.notebook.Model.Entity.Notebook;
import lesson2.notebook.Model.Model;
import lesson2.notebook.View.View;

/**
 * Main class  in which the program is launched
 */
public class Main {
    /**
     * Initializes new Controller.
     * @param args input args in manin method
     */
    public static void main(String[] args) {
        Controller controller = new Controller(new Model(), new View());
        controller.userProcess();
    }

}

package lesson2.notebook;

/**
 * Main class  in which the program is launched
 */
public class Main {
    /**
     * Initializes new Controller.
     * @param args input args in manin method
     */
    public static void main(String[] args) {
        Controller controller = new Controller(new Notebook(), new View());
        controller.userProcess();
    }

}

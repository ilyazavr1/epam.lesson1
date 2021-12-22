package lesson2.notebook.Controller;

import lesson2.notebook.RegexConstants;
import lesson2.notebook.View.View;

import java.util.Scanner;

/**
 * ScannerService validates user input a
 *
 * @author Illia Smiian
 * @version 1.0
 * @since 2021-12-16
 */

public class UtilityController implements RegexConstants {
    private final Scanner scanner;
    private final View view;

    /**
     * Constructor accepts view for printing messages to user and
     * scanner to use input from console.
     * @param view to use output in console
     * @param scanner to get input form console
     */
    public UtilityController(View view, Scanner scanner) {
        this.scanner = scanner;
        this.view = view;
    }

    /**
     * Prints message that requires to input data.
     * Validates input with given regex.
     * Returns validated input.
     *
     * @param message requires to input data from user
     * @param regex   to validate input data
     * @return validated input
     */
    public String inputValue(String message, String regex) {
        String name;

        view.printStringInput(message);
        name = scanner.nextLine();

        while (!name.matches(regex)) {
            view.printWrongStringInput(message);
            name = scanner.nextLine();
        }

        return name;
    }
}

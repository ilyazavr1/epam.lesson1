package lesson2.notebook.View;

import lesson2.notebook.Model.Entity.Notebook;

import java.util.Locale;
import java.util.ResourceBundle;

import static lesson2.notebook.TextConstants.INPUT_DATA;
import static lesson2.notebook.TextConstants.WRONG_INPUT_DATA;



/**
 * View module to print messages in console.
 *
 * @author Illia Smiian
 * @version 1.0
 * @since 2021-12-16
 */
public class View {
    private static String MESSAGES_BUNDLE_NAME = "messages";

    public static final ResourceBundle bundle = ResourceBundle.getBundle(MESSAGES_BUNDLE_NAME, new Locale("ua", "UA"));
                    //new Locale("ua", "UA"));  // Ukrainian
                    // new Locale("en"));        // English


    public void printStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(INPUT_DATA),
                bundle.getString(message)));
    }

    public void printWrongStringInput(String message) {
        printMessage(concatenationString(
                bundle.getString(WRONG_INPUT_DATA),
                bundle.getString(INPUT_DATA),
                bundle.getString(message)));
    }

        private String concatenationString(String... message){
        StringBuilder concatString = new StringBuilder();
        for(String v : message) {concatString.append(v);}
        return new String(concatString);
    }

    private void printMessage(String message){
        System.out.println(message);
    }




    /**
     * Prints messages that requires to input specific data
     * accepted in param.
     *
     * @param args list of messages to print
     */
    public void printInput(String... args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Input ");
        for (String str : args) {
            stringBuilder.append(str);
        }
        System.out.println(stringBuilder);
    }

    /**
     * Prints messages that required input was wrong
     *
     * @param args messages that was wrong
     */
    public void printWrongInput(String... args) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Wrong input of ");
        for (String str : args) {
            stringBuilder.append(str);
        }
        stringBuilder.append(". Try again");
        System.out.println(stringBuilder);
    }

    /**
     * Prints full name form given model type of Notebook.
     * Output format: second name + whitespace + first letter of name
     *
     * @param notebook given object to print
     */
    public void printFullName(Notebook notebook) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder
                .append(notebook.getSecondName())
                .append(" ")
                .append(notebook.getName().charAt(0));

        System.out.println(stringBuilder);
    }

}

package lesson2.notebook;

/**
 * View module to print messages in console.
 *
 * @author Illia Smiian
 * @version 1.0
 * @since 2021-12-16
 */
public class View {

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

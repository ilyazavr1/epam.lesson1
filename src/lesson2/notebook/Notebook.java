package lesson2.notebook;
/**
 * Representing an notebook
 *
 * @author Illia Smiian
 * @version 1.0
 * @since 2021-12-16
 */
public class Notebook {

    private String secondName;
    private String name;
    private String surname;


    /**
     * Initialize new object of Notebook with empty fields.
     */
    public Notebook() {
    }

    /**
     * Initialize new object of Notebook with given parameters.
     *
     * @param secondName String representing second name
     * @param name       String representing name
     * @param surname    String representing surname
     */
    public Notebook(String secondName, String name, String surname) {
        this.secondName = secondName;
        this.name = name;
        this.surname = surname;

    }

    /**
     * Returns second name from notebook.
     *
     * @return String representing second name
     */
    public String getSecondName() {
        return secondName;
    }

    /**
     * Sets second name in notebook.
     *
     * @param secondName string representing second name
     */
    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    /**
     * Returns  name from notebook.
     *
     * @return String representing name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name in notebook.
     *
     * @param name string representing name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns surname from notebook.
     *
     * @return String representing surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * Sets surname in notebook.
     *
     * @param surname string representing surname
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

}

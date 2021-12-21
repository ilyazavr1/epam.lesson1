package lesson2.notebook.Model;

import lesson2.notebook.Controller.UtilityController;
import lesson2.notebook.Model.Entity.Notebook;
import lesson2.notebook.RegexConstants;
import lesson2.notebook.TextConstants;
import lesson2.notebook.View.View;

import java.util.Scanner;

public class NotebookService implements TextConstants, RegexConstants {

    private View view;
    private Scanner sc;

    private String firstName;
    private String login;

    public NotebookService(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }


    public void inputNote(){
        Notebook notebook = new Notebook();
        UtilityController utilityController = new UtilityController(view, new Scanner(System.in));

        notebook.setName(utilityController.inputValue(REQUIRE_NAME, REGEX_NAME));
       // notebook.setSecondName(utilityController.inputValue(REQUIRE_SECOND_NAME, REGEX_SECOND_NAME));
       // notebook.setSurname(utilityController.inputValue(REQUIRE_SURNAME, REGEX_SURNAME));
        notebook.setLogin(utilityController.inputValue(REQUIRE_LOGIN, REGEX_LOGIN));


    }
}

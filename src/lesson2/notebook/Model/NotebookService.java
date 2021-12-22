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

    private String name;
    private String login;

    public NotebookService(View view, Scanner sc) {
        this.view = view;
        this.sc = sc;
    }


    public void inputNote(){
        String regexBundleName = (String.valueOf(View.bundle.getLocale()).equals("ua"))
                ? REGEX_NAME_UKR : REGEX_NAME;
        UtilityController utilityController = new UtilityController(view, new Scanner(System.in));

        this.name = utilityController.inputValue(FIRST_NAME, regexBundleName);
        this.login = utilityController.inputValue(LOGIN_DATA, REGEX_LOGIN);

    }
    public void inputLogin(){
        UtilityController utilityController = new UtilityController(view, new Scanner(System.in));
        this.login = utilityController.inputValue(LOGIN_DATA, REGEX_LOGIN);
    }

    public String getName(){
        return this.name;
    }
    public String getLogin(){
        return this.login;
    }

}

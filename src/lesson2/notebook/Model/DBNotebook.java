package lesson2.notebook.Model;

import lesson2.notebook.Model.Entity.Notebook;

import java.util.ArrayList;
import java.util.List;

public class DBNotebook {
    private static final List<Notebook> listDB = new ArrayList<>(){};

    static {
        try {
            listDB.add(new Notebook("Vlad", "vlad123"));
            listDB.add(new Notebook("Masha", "masha123"));
            listDB.add(new Notebook("Nikita", "nikita123"));
        } catch (NotUniqueLoginException e) {
            e.printStackTrace();
        }


    }


    public static boolean checkLogin(String login) {
        for (Notebook notebook : listDB) {
            if (notebook.getLogin().equals(login)) return true;

        }
        return false;
    }

}

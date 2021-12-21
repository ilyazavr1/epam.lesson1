package lesson2.notebook.Model;

import lesson2.notebook.Model.Entity.Notebook;

import java.util.ArrayList;
import java.util.List;

public class DBNotebook {
    private final List<Notebook> listDB = new ArrayList<>();

    {
        listDB.add(new Notebook("Vasya", "vasya123"));
    }


}

package commands;

import data.Worker;
import manager.CollectionManager;

import java.util.TreeMap;

public class Show implements Command {
    @Override
    public void execute(String[] arg)  {
        TreeMap<String, Worker> map = CollectionManager.getMap();
        if (map.isEmpty()) {
            System.out.println(CollectionManager.getMap().getClass().getName() + " is empty");
            return;
        }
        for (String s : map.keySet()) {
            System.out.println(map.get(s));
        }

    }

    @Override
    public String getName() {
        return "show";
    }

    @Override
    public String getDescription() {
        return "вывести в стандартный поток вывода все элементы коллекции в строковом представлении";
    }
}
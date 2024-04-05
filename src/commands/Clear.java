package commands;

import data.Worker;
import errors.UnknownElementException;
import manager.CollectionManager;

import java.util.TreeMap;

public class Clear implements Command{
    @Override
    public void execute(String[] arg) throws UnknownElementException {
        TreeMap<String, Worker> map = CollectionManager.getMap();
        map.clear();
        CollectionManager.setMap(map);
        System.out.println("Clear...");
    }

    @Override
    public String getName() {
        return "clear";
    }

    @Override
    public String getDescription() {
        return "очистить коллекцию";
    }
}

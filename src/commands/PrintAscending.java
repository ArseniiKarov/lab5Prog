package commands;

import data.Worker;
import errors.NoElementException;

import java.util.Map;
import java.util.TreeMap;

import static manager.CollectionManager.getMap;

public class PrintAscending implements Command {
    @Override
    public void execute(String[] args) throws NoElementException {
        TreeMap<String, Worker> treeMap = getMap();
        for (Map.Entry<String, Worker> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    @Override
    public String getName() {
        return "print_ascending";
    }

    @Override
    public String getDescription() {
        return "Print the elements of the collection in ascending order";
    }
}
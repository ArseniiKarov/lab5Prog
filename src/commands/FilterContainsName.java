package commands;

import data.Worker;
import errors.NoElementException;

import java.util.Map;
import java.util.TreeMap;

public class FilterContainsName implements Command {
    @Override
    public void execute(String[] args) throws NoElementException, Exception {
        TreeMap<String, Worker> map = new TreeMap<>();

        String substring = args[0]; // Подстрока для поиска

        for (Map.Entry<String, Worker> entry : map.entrySet()) {
            if (entry.getKey().contains(substring)) {
                Worker worker = entry.getValue();
            }
        }
    }
    @Override
    public String getName() {
        return "filter_contains_name";
    }

    @Override
    public String getDescription() {
        return "вывести элементы, значение поля name которых содержит заданную подстроку";
    }
}

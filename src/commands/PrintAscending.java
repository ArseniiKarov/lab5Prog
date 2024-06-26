package commands;

import data.Worker;
import errors.NoElementException;

import java.util.Map;
import java.util.TreeMap;

import static manager.CollectionManager.getMap;

public class PrintAscending implements Command {
    /**
     * Метод для выполнения команда
     * @param args аргументы
     * @throws NoElementException ошибка отсутствия элемента
     */
    @Override
    public void execute(String[] args) throws NoElementException {
        TreeMap<String, Worker> treeMap = getMap();
        for (Map.Entry<String, Worker> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "print_ascending";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "Print the elements of the collection in ascending order";
    }
}
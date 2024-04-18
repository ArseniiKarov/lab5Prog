package commands;

import data.Worker;
import errors.UnknownElementException;
import manager.CollectionManager;

import java.util.TreeMap;

public class Clear implements Command{
    /**
     * Метод для выполнения команда
     * @param arg аргументы
     * @throws UnknownElementException ошибка неизвестного элемента
     */
    @Override
    public void execute(String[] arg) throws UnknownElementException {
        TreeMap<String, Worker> map = CollectionManager.getMap();
        map.clear();
        CollectionManager.setMap(map);
        System.out.println("Clear...");
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "clear";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "очистить коллекцию";
    }
}

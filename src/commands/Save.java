package commands;

import manager.JsonParser;

import java.io.IOException;


public class Save implements Command {
    /**
     * Метод для выполнения команда
     * @param arg аргументы
     * @throws IOException ошибка системы
     */
    @Override
    public void execute(String[] arg) throws IOException {
        JsonParser.write();
        System.out.println("Сохранено");
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "save";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "сохранить коллекцию в файл";
    }
}
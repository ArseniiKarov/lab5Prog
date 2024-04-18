package commands;

import errors.NoElementException;

public interface Command {
    /**
     * Метод для выполнения команда
     * @param args аргументы
     * @throws NoElementException ошибка отсутствия элемента
     * @throws Exception ошибка
     */
    public void execute(String[] args) throws NoElementException, Exception;

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    public String getName();

    /**
     * Метод для описания команды
     * @return описание
     */
    public String getDescription();
}
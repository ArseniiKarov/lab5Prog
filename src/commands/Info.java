package commands;

import manager.CollectionManager;

public class Info implements Command{
    /**
     * Метод для выполнения команда
     * @param arg аргументы
     */
    @Override
    public void execute(String[] arg) {
        System.out.println("Data type - " + CollectionManager.getMap().getClass().getName());
        System.out.println("Count of persons - " + CollectionManager.getMap().size());
        System.out.println("Init date - " + CollectionManager.getDate());

    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "info";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "вывести в стандартный поток вывода информацию о коллекции (тип, дата инициализации, количество элементов и т.д.)";
    }

}

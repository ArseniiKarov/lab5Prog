package manager.commands;

import errors.UnknownElementException;
import manager.CollectionManager;

public class RemoveKey implements Command {
    /**
     * Метод для выполнения команда
     * @param arg аргументы
     * @throws UnknownElementException ошибка неизвестного элемента
     */
    @Override
    public void execute(String[] arg) throws UnknownElementException {
        if (arg.length == 1) {
            System.out.println("введите ключ после 'remove_key'");
        }else{
            CollectionManager.remove(arg[1]);
            System.out.println("удаление выполнено");
        }
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "remove_key";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "удалить элемент из коллекции по его ключу";
    }
}

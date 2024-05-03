package manager.commands;

import data.Worker;
import errors.NoElementException;
import errors.UnknownElementException;
import manager.CollectionManager;

public class RemoveAnyBySalary implements Command {
    /**
     * Метод для выполнения команда
     * @param arg аргументы
     * @throws NoElementException ошибка отсутствия элемента
     */
    @Override
    public void execute(String[] arg) throws NoElementException {
        try {
            float salaryToRemove = Float.parseFloat(arg[1]) ;
            for (String key : CollectionManager.getMap().keySet()) {
                if (CollectionManager.getMap().get(key).getSalary() == salaryToRemove) {
                    Worker worker = new Worker();
                    CollectionManager.remove(key);
                    CollectionManager.add(key, worker);
                    System.out.println("удаление выполнено");
                }
                else {
                    throw new UnknownElementException();
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "remove_any_by_salary";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "удалить из коллекции один элемент, значение поля salary которого эквивалентно заданному";
    }
}

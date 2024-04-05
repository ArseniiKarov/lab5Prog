package commands;

import data.Worker;
import errors.NoElementException;
import errors.UnknownElementException;
import manager.CollectionManager;

public class RemoveAnyBySalary implements Command {
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

    @Override
    public String getName() {
        return "remove_any_by_salary";
    }

    @Override
    public String getDescription() {
        return "удалить из коллекции один элемент, значение поля salary которого эквивалентно заданному";
    }
}

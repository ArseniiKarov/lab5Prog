package commands;

import data.Worker;
import data.generators.WorkerGenerator;
import errors.NoElementException;
import manager.CollectionManager;

public class UpdateId implements Command {
    @Override
    public void execute(String[] arg) throws NoElementException {
        try {
            if (arg.length == 1) {
                System.out.println("введите id после 'update_id'");
            }else{
                int id = Integer.parseInt(arg[1]);
                for (String key : CollectionManager.getMap().keySet()) {
                    if (CollectionManager.getMap().get(key).getId() == id) {

                        Worker worker = WorkerGenerator.createWorker((long) id);
                        CollectionManager.remove(key);
                        CollectionManager.add(key, worker);

                        System.out.println("элемент был обновлен");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String getName() {
        return "update_id";
    }

    @Override
    public String getDescription() {
        return "обновить значение элемента коллекции, id которого равен заданному";
    }
}

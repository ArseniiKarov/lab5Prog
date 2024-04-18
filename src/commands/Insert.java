package commands;

import data.Worker;
import data.generators.WorkerGenerator;
import manager.CollectionManager;

public class Insert implements Command {
    /**
     * Метод для выполнения команда
     * @param arg аргументы
     * @throws Exception ошибка
     */

    @Override
    public void execute(String[] arg) throws Exception {
        if (arg.length == 1){
            System.out.println("введите ключ после 'insert'");
        }else{
            Worker worker = WorkerGenerator.createWorker(0L);
            CollectionManager.add(arg[1], worker);
        }

    }

    /**
     * Метод для получения имени команды
     * @return именя команды
     */
    @Override
    public String getName() {
        return "insert";
    }

    /**
     * Метод для описания команды
     * @return описание
     */
    @Override
    public String getDescription() {
        return "добавить новый элемент с заданным ключом";
    }
}
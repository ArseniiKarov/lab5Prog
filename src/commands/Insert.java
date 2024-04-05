package commands;

import data.Worker;
import data.generators.WorkerGenerator;
import manager.CollectionManager;

public class Insert implements Command {

    @Override
    public void execute(String[] arg) throws Exception {
        if (arg.length == 1){
            System.out.println("введите ключ после 'insert'");
        }else{
            Worker worker = WorkerGenerator.createWorker(0L);
            CollectionManager.add(arg[1], worker);
        }

    }

    @Override
    public String getName() {
        return "insert";
    }

    @Override
    public String getDescription() {
        return "добавить новый элемент с заданным ключом";
    }
}
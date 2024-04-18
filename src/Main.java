import data.Worker;
import errors.NoElementException;
import manager.CollectionManager;
import manager.Console;
import manager.JsonParser;

import java.io.IOException;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) throws NoElementException, IOException {
        CollectionManager cm;
        if(args.length > 0) {
            JsonParser reader = new JsonParser(args[0]);
            TreeMap<String, Worker> workers = reader.loadFromJson();
            cm = new CollectionManager(workers);
            System.out.println("прочитано");
           // Save save = new Save();
        }else{
            System.out.println("ну ладно");
            cm = new CollectionManager();
        }
        Console console = new Console();
        System.out.println("Введите команду 'help', чтобы увидеть все доступные команды");
        console.start(System.in, args, cm);
    }
}
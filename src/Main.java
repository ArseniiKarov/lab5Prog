import commands.Save;
import errors.NoElementException;
import manager.CollectionManager;
import manager.Console;
import manager.JsonReader;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws NoElementException, IOException {
        CollectionManager cm;
        if(args.length > 2) {
            JsonReader reader = new JsonReader();
             cm = reader.jsonReader(reader.readJson(args));

            System.out.println("прочитано");
            Save save = new Save();
        }else{
            System.out.println("ну ладно");
            cm = new CollectionManager();
        }
        Console console = new Console();
        System.out.println("Введите команду 'help', чтобы увидеть все доступные команды");
        console.start(System.in, args);
    }
}
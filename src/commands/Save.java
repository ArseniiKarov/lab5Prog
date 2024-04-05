package commands;

import manager.JsonWriter;

import java.io.IOException;


public class Save implements Command {
    @Override
    public void execute(String[] arg) throws IOException {
        JsonWriter.write(arg[0]);
        System.out.println("Сохранено");
    }

    @Override
    public String getName() {
        return "save";
    }

    @Override
    public String getDescription() {
        return "сохранить коллекцию в файл";
    }
}